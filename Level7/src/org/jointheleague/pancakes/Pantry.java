package org.jointheleague.pancakes;

public class Pantry implements Ingredients
{
	private int portionsOfFlour;
	private int eggs;
	private int baconStrips;

	public Pantry(int portionsOfFlour, int eggs, int baconStrips)
	{
		this.portionsOfFlour = portionsOfFlour;
		this.eggs = eggs;
		this.baconStrips = baconStrips;
	}

	public String getIngredients()
	{
		return (getPortionsOfFlour() + " portions of flour, " + getEggs() + " eggs, " + getBaconStrips() + " bacon strips");
	}

	@Override
	public int getPortionsOfFlour()
	{
		return portionsOfFlour;
	}

	@Override
	public int getEggs()
	{
		return eggs;
	}

	@Override
	public int getBaconStrips()
	{
		return baconStrips;
	}

}
