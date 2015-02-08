package org.jointheleague.snakesonaplane;

import java.util.ArrayList;

public class Hollywood
{
	static Plane plane;
	static ArrayList<Snake> snakes;

	public static void main(String[] args)
	{
		snakes = new ArrayList<Snake>();
		int numOfSnakes = 100;
		for (int i = 0; i < numOfSnakes; i++)
		{
			snakes.add(SnakeFactory.createSnake());
		}
		plane = new Plane(snakes);
		System.out.println("Samuel L. Jackson has to kill " + numOfSnakesSamNeedsToKill() + " snakes.");
	}

	private static int numOfSnakesSamNeedsToKill()
	{
		return plane.numOfDangerusSnakes();
	}
}
