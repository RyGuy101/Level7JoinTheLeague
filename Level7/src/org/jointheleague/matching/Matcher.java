package org.jointheleague.matching;

/**
 * If you want a safety net, unit tests for this class can be found here:
 * bit.ly/matcher-unit-tests
 */

public class Matcher
{
	public boolean match(int[] expected, int[] actual, int clipLimit, int delta)
	{
		clipBigValues(actual, clipLimit);
		return lengthsMatch(expected, actual) && valueDifferncesAreWithinDelta(expected, actual, delta);
	}

	private boolean lengthsMatch(int[] expected, int[] actual)
	{
		return actual.length == expected.length;
	}

	private void clipBigValues(int[] actual, int clipLimit)
	{
		for (int i = 0; i < actual.length; i++)
			if (actual[i] > clipLimit)
				actual[i] = clipLimit;
	}

	private boolean valueDifferncesAreWithinDelta(int[] expected, int[] actual, int delta)
	{
		for (int i = 0; i < actual.length; i++)
		{
			if (Math.abs(expected[i] - actual[i]) > delta)
			{
				return false;
			}
		}
		return true;
	}

}
