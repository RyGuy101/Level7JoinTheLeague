package org.jointheleague.food;

import static org.junit.Assert.*;

import org.junit.Test;

public class FoodTest
{

	@Test
	public void testIsHealthy()
	{
		assertEquals(false, new Food("Sugary and Fatty", true, true).isHealthy());
		assertEquals(false, new Food("Sugary but not Fatty", true, false).isHealthy());
		assertEquals(false, new Food("Fatty but not Sugary", false, true).isHealthy());
		assertEquals(true, new Food("Not Sugary or Fatty", false, false).isHealthy());
	}

}
