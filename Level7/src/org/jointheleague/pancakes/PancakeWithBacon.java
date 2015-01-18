package org.jointheleague.pancakes;

public class PancakeWithBacon extends PancakeWithStuff
{
	public PancakeWithBacon(Pancake p)
	{
		super(p);
	}

	@Override
	public double getPrice()
	{
		return 1.50 + p.getPrice();
	}

	@Override
	public boolean isVegetarian()
	{
		return false;
	}

	@Override
	public int getPortionsOfFlour()
	{
		return p.getPortionsOfFlour();
	}

	@Override
	public int getEggs()
	{
		return p.getEggs();
	}

	@Override
	public int getBacon()
	{
		return p.getBacon() + 1;
	}
}
