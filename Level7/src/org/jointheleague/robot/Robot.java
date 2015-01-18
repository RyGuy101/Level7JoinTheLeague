package org.jointheleague.robot;

/**
 * Test that robot will turn when it gets too close to the wall (50mm). We don’t
 * want the robot to hit the wall. Vic is fixing your ultrasonic sensors so you
 * have to make do without them.
 **/

public class Robot
{

	private int heading = 0;
	private int consecutiveTurns = 0;
	private UltrasonicSensor ultrasonicSensor = new LegitUltrasonicSensor();

	public void run()
	{
		if (ultrasonicSensor.getDistance() <= 50)
			if (consecutiveTurns >= 3)
			{
				driveDirect(5, 0);
				try
				{
					Thread.sleep(50);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				heading += 45;
				heading %= 360;
				consecutiveTurns = 0;
			} else
				try
				{
					turn();
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
		else
			try
			{
				goForward();
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
	}

	public void setUltrasonicSensor(UltrasonicSensor ultrasonicSensor)
	{
		this.ultrasonicSensor = ultrasonicSensor;
	}

	private void goForward() throws InterruptedException
	{
		driveDirect(100, 100);
		Thread.sleep(50);
		consecutiveTurns = 0;
	}

	private void turn() throws InterruptedException
	{
		driveDirect(100, -100);
		Thread.sleep(500);
		heading += 90;
		heading %= 360;
		consecutiveTurns++;
	}

	public int getHeading()
	{
		return heading;
	}

	private void driveDirect(int i, int j)
	{
		// does real stuff
	}

}

class LegitUltrasonicSensor implements UltrasonicSensor
{
	public int getDistance()
	{
		throw new NullPointerException("Ultrasonic sensor is not connected.");
	}
}