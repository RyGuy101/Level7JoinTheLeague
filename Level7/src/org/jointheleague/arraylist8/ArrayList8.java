package org.jointheleague.arraylist8;

import java.util.ArrayList;
import java.util.Date;
import java.util.function.Consumer;

public class ArrayList8
{
	public static void main(String[] args)
	{
		ArrayList<Integer> colors = new ArrayList();
		for (int i = 0; i < 100000000; i++)
		{
			colors.add(2);
		}

		long start1 = System.currentTimeMillis();
		colors.forEach(new Consumer<Integer>()
		{
			@Override
			public void accept(Integer t)
			{
				Math.sqrt(t);
			}
		});
		System.out.println();
		System.out.println(System.currentTimeMillis() - start1);

		long start2 = System.currentTimeMillis();
		for (Integer i : colors)
		{
			Math.sqrt(i);
		}
		System.out.println();
		System.out.println(System.currentTimeMillis() - start2);

		long start3 = System.currentTimeMillis();
		colors.forEach(Math::sqrt);
		System.out.println();
		System.out.println(System.currentTimeMillis() - start3);

		long start4 = System.currentTimeMillis();
		colors.forEach(color -> Math.sqrt(color));
		System.out.println();
		System.out.println(System.currentTimeMillis() - start4);
	}
}
