package org.jointheleague.pancakes;

import java.util.ArrayList;

public class OrderWithBacon extends OrderWithStuff
{
	public OrderWithBacon(Order o)
	{
		super(o);
	}

	@Override
	public double getPrice()
	{
		return 1.50 + o.getPrice();
	}

	@Override
	public boolean isVegetarian()
	{
		return false;
	}

	@Override
	public int getEggs()
	{
		return o.getEggs();
	}

	@Override
	public int getBaconStrips()
	{
		return o.getBaconStrips() + 1;
	}
}
