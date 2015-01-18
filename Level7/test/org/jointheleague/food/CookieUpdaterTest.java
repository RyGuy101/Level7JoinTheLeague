package org.jointheleague.food;

import static org.junit.Assert.*;

import org.junit.Test;

public class CookieUpdaterTest
{

	@Test
	public void test()
	{
		Cookie chocolateChip = new Cookie("Chocolate Chip");
		new CookieUpdater().updateName(chocolateChip);
		assertEquals("Tasty Chocolate Chip", chocolateChip.getName());
	}

}
