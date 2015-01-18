package org.jointheleague.apocalypse;

public class Robert implements Observer
{

	@Override
	public void notifyMe()
	{
		System.out.println("Robert is hoarding lots of beans.");
	}

}
