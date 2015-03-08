package org.jointheleague.duck;

import javax.swing.text.MaskFormatter;

import junit.framework.TestCase;

public class Duck extends TestCase
{
	private static int numberOfCreations = 0;
	private String color;
	private static Duck masterDuck = null;

	public static int getNumberOfCreations()
	{
		return numberOfCreations;
	}

	public String getColor()
	{
		return color;
	}

	private Duck()
	{
		numberOfCreations++;
		if (numberOfCreations % 2 == 1)
		{
			color = "black";
		} else
		{
			color = "white";
		}
	}

	public static Duck getDuck()
	{
		if (masterDuck == null)
		{
			masterDuck = new Duck();
		}
		return masterDuck;
	}
}