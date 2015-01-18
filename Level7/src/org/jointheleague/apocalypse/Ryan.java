package org.jointheleague.apocalypse;

public class Ryan implements Observer
{

	@Override
	public void notifyMe()
	{
		System.out.println("Ryan is hoarding all the batteries he can find.");
	}
}
