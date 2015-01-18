package org.jointheleague.milkshake;

import java.util.ArrayList;
import java.util.List;

public class Yard
{
	private MilkShake milkShake;

	public Yard(MilkShake milkShake)
	{
		this.milkShake = milkShake;
	}

	void bringBoysToTheYard(List<Boy> theBoys)
	{
		for (Boy boy : theBoys)
		{
			boy.bringToTheYard(milkShake);
		}
	}
}

class Boy
{
	private String name;

	public Boy(String name)
	{
		this.name = name;
	}

	public void bringToTheYard(MilkShake milkShake)
	{
		if (milkShake.cherryOnTop)
			System.out.println("damn right, it's better than yours");
		else
			System.out.println("i could teach you, but i'd have to charge");
	}
}
