package org.jointheleague.food;

/* Write a unit test for the isHealthy() method */

public class Food
{

	private String name;
	private boolean isHighInSugar;
	private boolean isHighInFat;

	Food(String name, boolean highSugarContent, boolean highFatContent)
	{
		this.name = name;
		this.isHighInFat = highFatContent;
		this.isHighInSugar = highSugarContent;
	}

	boolean isHealthy()
	{
		return !isHighInSugar && !isHighInFat;
	}

}
