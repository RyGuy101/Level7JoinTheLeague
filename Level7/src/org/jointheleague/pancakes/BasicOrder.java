package org.jointheleague.pancakes;

import java.util.ArrayList;

public class BasicOrder extends Order
{
	private ArrayList<Pancake> stack;

	public BasicOrder(ArrayList<Pancake> stack)
	{
		this.stack = stack;
	}

	@Override
	public int getPortionsOfFlour()
	{
		int portions = 0;
		for (Pancake p : stack)
		{
			portions += p.getPortionsOfFlour();
		}
		return portions;
	}

	@Override
	public int getEggs()
	{
		int eggs = 0;
		for (Pancake p : stack)
		{
			eggs += p.getEggs();
		}
		return eggs;
	}

	@Override
	public int getBaconStrips()
	{
		int baconStrips = 0;
		for (Pancake p : stack)
		{
			baconStrips += p.getBaconStrips();
		}
		return baconStrips;
	}

	@Override
	public double getPrice()
	{
		double price = 0;
		for (Pancake p : stack)
		{
			price += p.getPrice();
		}
		return price;
	}

	@Override
	public boolean isVegetarian()
	{
		return getBaconStrips() == 0;
	}
}
