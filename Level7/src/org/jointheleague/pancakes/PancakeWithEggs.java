package org.jointheleague.pancakes;

public class PancakeWithEggs extends PancakeWithStuff
{
	public PancakeWithEggs(Pancake p)
	{
		super(p);
	}

	@Override
	public double getPrice()
	{
		return 1.00 + p.getPrice();
	}

	@Override
	public boolean isVegetarian()
	{
		return true;
	}

	@Override
	public int getPortionsOfFlour()
	{
		return p.getPortionsOfFlour();
	}

	@Override
	public int getEggs()
	{
		return p.getEggs() + 1;
	}

	@Override
	public int getBacon()
	{
		return p.getBacon();
	}
}
