package org.jointheleague.duck;

public class Jellyfish
{
	private static int numberOfJellyfish = 0;
	private boolean poisonous;

	public Jellyfish()
	{
		numberOfJellyfish++;
		if (numberOfJellyfish % 4 == 0)
		{
			poisonous = true;
		} else
		{
			poisonous = false;
		}
	}

	public boolean isPoisonous()
	{
		return poisonous;
	}
}
