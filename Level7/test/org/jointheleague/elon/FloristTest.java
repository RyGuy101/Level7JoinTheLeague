package org.jointheleague.elon;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class FloristTest
{
	public class FakeFlorist implements Florist
	{
		private boolean orderedFlowers = false;

		@Override
		public void orderFlowers()
		{
			orderedFlowers = true;
		}

		public boolean isOrderedFlowers()
		{
			return orderedFlowers;
		}
	}

	@Test
	public void testOrderFlowersOnValentinesDay()
	{
		HappyMarriage marriage = new HappyMarriage();
		Calendar valentinesDay = Calendar.getInstance();
		valentinesDay.set(2014, 2, 14);
		FakeFlorist freddy = new FakeFlorist();
		assertFalse(freddy.isOrderedFlowers());
		marriage.sendFlowersOnValentinesDay(freddy, valentinesDay);
		assertTrue(freddy.isOrderedFlowers());
	}

	@Test
	public void testOrderFlowersOnPiDay()
	{
		HappyMarriage marriage = new HappyMarriage();
		Calendar valentinesDay = Calendar.getInstance();
		valentinesDay.set(2014, 3, 14);
		FakeFlorist freddy = new FakeFlorist();
		assertFalse(freddy.isOrderedFlowers());
		marriage.sendFlowersOnValentinesDay(freddy, valentinesDay);
		assertFalse(freddy.isOrderedFlowers());
	}

}
