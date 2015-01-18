package org.jointheleague.pancakes;

public class PlainPancake extends Pancake
{
	private static int numberOfPancakes = 0;
	private int pancakeID;

	public PlainPancake()
	{
		numberOfPancakes += 1;
		pancakeID = numberOfPancakes;
	}

	@Override
	public double getPrice()
	{
		return 6.50;
	}

	@Override
	public int getPortionsOfFlour()
	{
		return 5;
	}

	@Override
	public int getEggs()
	{
		return pancakeID % 2;
	}

	@Override
	public int getBacon()
	{
		return 0;
	}
}
