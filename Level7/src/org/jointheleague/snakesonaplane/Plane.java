package org.jointheleague.snakesonaplane;

import java.util.ArrayList;

public class Plane
{
	private ArrayList<Snake> snakes;

	public Plane(ArrayList<Snake> snakes)
	{
		this.snakes = snakes;
	}

	public int numOfDangerusSnakes()
	{
		int num = 0;
		for (Snake s : snakes)
		{
			if (s.isVenomous() && s.getViciousness() > 3)
			{
				num++;
			}
		}
		return num;
	}
}
