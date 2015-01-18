package org.jointheleague.pancakes;

import java.util.ArrayList;

public class OrderWithEgg extends OrderWithStuff
{
	public OrderWithEgg(Order o)
	{
		super(o);
	}

	@Override
	public double getPrice()
	{
		return 1.00 + o.getPrice();
	}

	@Override
	public boolean isVegetarian()
	{
		if (o.isVegetarian())
		{
			return true;
		}
		return false;
	}

	@Override
	public int getEggs()
	{
		return o.getEggs() + 1;
	}

	@Override
	public int getBaconStrips()
	{
		return o.getBaconStrips();
	}
}
