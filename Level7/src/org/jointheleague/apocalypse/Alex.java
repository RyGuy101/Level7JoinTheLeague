package org.jointheleague.apocalypse;

public class Alex implements Observer
{

	@Override
	public void notifyMe()
	{
		System.out.println("Alex is putting all his food on ice.");
	}

}
