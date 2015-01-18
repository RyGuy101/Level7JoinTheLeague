package org.jointheleague.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleAreaCalculatorTest
{

	@Test
	public void testCalculateArea()
	{
		assertEquals(Math.PI * 9.0, new CircleAreaCalculator().calculateArea(3), 0);
	}

}
