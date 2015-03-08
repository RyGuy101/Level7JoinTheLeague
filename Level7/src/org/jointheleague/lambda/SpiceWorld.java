package org.jointheleague.lambda;

public class SpiceWorld
{
	public static void main(String[] args)
	{
		SpiceGirl<String> sg = () -> {return "I'm Ginger. I'm the only good spice girl because I'm actually a spice.";};
		System.out.println(sg.performance());
	}
}
