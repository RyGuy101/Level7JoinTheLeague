package org.jointheleague.spoon;

public class SingleSpoon
{
	private String soupLastUsedWith;

	private static SingleSpoon theSpoon;
	private static boolean theSpoonIsAvailable = true;

	public static SingleSpoon getTheSpoon()
	{
		if (theSpoon == null)
		{
			theSpoon = new SingleSpoon();
		}
		if (theSpoonIsAvailable)
		{
			theSpoonIsAvailable = false;
			return theSpoon;
		} else
		{
			return null;
		}

	}

	public static void returnTheSpoon()
	{
		theSpoon.cleanSpoon();
		theSpoonIsAvailable = true;
	}

	public String getSoupLastUsedWith()
	{
		return this.soupLastUsedWith;
	}

	public void setSoupLastUsedWith(String soup)
	{
		this.soupLastUsedWith = soup;
	}

	public void cleanSpoon()
	{
		this.setSoupLastUsedWith(null);
	}
}
