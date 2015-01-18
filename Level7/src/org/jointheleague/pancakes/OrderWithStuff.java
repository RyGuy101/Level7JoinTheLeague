package org.jointheleague.pancakes;

import java.util.ArrayList;

public abstract class OrderWithStuff extends Order
{
	public OrderWithStuff(Order o)
	{
		this.o = o;
	}

	protected Order o;

	@Override
	public int getPortionsOfFlour()
	{
		return o.getPortionsOfFlour();
	}
}
