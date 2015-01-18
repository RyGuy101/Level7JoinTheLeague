package org.jointheleague.pancakes;

import java.util.ArrayList;

public abstract class Order implements Ingredients, Price
{
	public String getIngredients()
	{
		return (getPortionsOfFlour() + " portions of flour, " + getEggs() + " eggs, " + getBaconStrips() + " bacon strips");
	}

	public boolean isAvailable(Pantry pantry)
	{
		return this.getPortionsOfFlour() <= pantry.getPortionsOfFlour() && this.getEggs() <= pantry.getEggs() && this.getBaconStrips() <= pantry.getBaconStrips();
	}

	public abstract boolean isVegetarian(); // AKA notEvil
}
