package org.jointheleague.apocalypse;

import java.util.ArrayList;

public class Apocalypse
{
	ArrayList<Observer> observers = new ArrayList<Observer>();

	public void registerObserver(Observer observer)
	{
		observers.add(observer);
	}

	public void unregisterObserver(Observer observer)
	{
		observers.remove(observer);
	}

	public void ringTheAlarm()
	{
		System.out.println("IT'S THE APOCALYPSE!!!");
		notifyObservers();
	}

	private void notifyObservers()
	{
		for (Observer observer : observers)
		{
			observer.notifyMe();
		}
	}
}
