package org.jointheleague.pancakes;

public abstract class Pancake implements Ingredients, Price
{
	private static int numberOfPancakes = 0;
	private int pancakeID;

	public Pancake()
	{
		numberOfPancakes += 1;
		pancakeID = numberOfPancakes;
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
	public int getBaconStrips()
	{
		return 0;
	}
}
