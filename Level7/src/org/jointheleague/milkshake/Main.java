package org.jointheleague.milkshake;

import java.util.ArrayList;
import java.util.List;

public class Main
{
	private static List<Boy> allTheBoys = new ArrayList<Boy>();

	public static void main(String[] args)
	{
		Yard theYard = new Yard(new MilkShake("vanilla", false, "strawberry"));
		allTheBoys.add(new Boy("groucho"));
		allTheBoys.add(new Boy("harpo"));
		allTheBoys.add(new Boy("zeppo"));
		theYard.bringBoysToTheYard(allTheBoys);
	}

}
