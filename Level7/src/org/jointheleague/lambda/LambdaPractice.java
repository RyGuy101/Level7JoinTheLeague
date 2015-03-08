package org.jointheleague.lambda;

import java.util.concurrent.Callable;

public class LambdaPractice
{
	public static void main(String[] args) throws Exception
	{
		Thread t = new Thread(() -> {
			System.out.println("running thread");
		});
		t.start();
		Runnable r = () -> System.out.println("Hi");
		r.run();
		Callable<String> c = () -> {return "3.1415926535897932384626433832795028841971693993751";};
		System.out.println(c.call());
	}
}
