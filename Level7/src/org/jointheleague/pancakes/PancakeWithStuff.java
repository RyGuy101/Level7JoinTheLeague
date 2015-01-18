package org.jointheleague.pancakes;

public abstract class PancakeWithStuff extends Pancake
{
	protected Pancake p;

	public PancakeWithStuff(Pancake p)
	{
		this.p = p;
	}

	@Override
	public abstract double getPrice();
	
	public abstract boolean isVegetarian(); // AKA notEvil
}
