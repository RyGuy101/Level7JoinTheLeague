package org.jointheleague.droplikehot;

public class DropItLikeItsHot
{
	Object snoop;

	public static void main(String[] args)
	{
		new DropItLikeItsHot().snoopSay();
	}

	private void snoopSay()
	{
		/*
		 * When the thePimpsInTheCrib ma, drop it like it's hot. When the
		 * thePigsTryToGetAtYa, drop it like it's hot. When aNiggaGetAnAttitude,
		 * drop it like it's hot.
		 */
		if (getWhoIsInTheCrib().equals("The Pimp") || getWhoThePigsAreAfter().equals(snoop) || getWhoHasAnAttitude().equals("a nigga"))
			System.out.println("Drop it like it's hot");
	}

	private Object getWhoHasAnAttitude()
	{
		return "a nigga";
	}

	private Object getWhoThePigsAreAfter()
	{
		return new String("Snoop Dogg");
	}

	private Object getWhoIsInTheCrib()
	{
		return "The Pimp";
	}
}
