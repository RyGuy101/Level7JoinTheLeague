package org.jointheleague.robot;

import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTest
{
	class FakeUltrasonicSensor implements UltrasonicSensor
	{
		private int distance;

		public FakeUltrasonicSensor(int distance)
		{
			this.distance = distance;
		}

		@Override
		public int getDistance()
		{
			return distance;
		}
	}

	@Test
	public void testAvoidWall()
	{
		Robot ferrari = new Robot();
		ferrari.setUltrasonicSensor(new FakeUltrasonicSensor(49));
		assertEquals(0, ferrari.getHeading());
		ferrari.run();
		assertEquals(90, ferrari.getHeading());
		ferrari.run();
		assertEquals(180, ferrari.getHeading());
		ferrari.run();
		assertEquals(270, ferrari.getHeading());
	}

	@Test
	public void testDoesNotGoInCircles()
	{
		Robot lambourghini = new Robot();
		lambourghini.setUltrasonicSensor(new FakeUltrasonicSensor(49));
		assertEquals(0, lambourghini.getHeading());
		for (int i = 0; i < 3; i++)
		{
			lambourghini.run();
		}
		lambourghini.run();
		assertEquals(315, lambourghini.getHeading());
	}

	@Test
	public void testMoveIfNoWall()
	{
		Robot porsche = new Robot();
		porsche.setUltrasonicSensor(new FakeUltrasonicSensor(51));
		assertEquals(0, porsche.getHeading());
		porsche.run();
		assertEquals(0, porsche.getHeading());
	}
}
