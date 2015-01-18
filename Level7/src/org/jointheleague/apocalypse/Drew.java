package org.jointheleague.apocalypse;

public class Drew implements Observer
{

	@Override
	public void notifyMe()
	{
		System.out.println("Drew is buying lots of chickens.");
	}

}
