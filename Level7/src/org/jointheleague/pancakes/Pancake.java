package org.jointheleague.pancakes;

public abstract class Pancake
{
	public abstract double getPrice();

	public abstract int getPortionsOfFlour();

	public abstract int getEggs();

	public abstract int getBacon();

	public String getIngredients()
	{
		return (getPortionsOfFlour() + " portions of flour, " + getEggs() + " eggs, " + getBacon() + " bacon strips");
	}

}
