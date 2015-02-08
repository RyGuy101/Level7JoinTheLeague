package org.jointheleague.snakesonaplane;

public class Snake
{
	private int viciousness;
	public int getViciousness()
	{
		return viciousness;
	}

	public void setViciousness(int viciousness)
	{
		this.viciousness = viciousness;
	}

	private boolean venomous;

	public boolean isVenomous()
	{
		return venomous;
	}

	public void setVenomous(boolean venomous)
	{
		this.venomous = venomous;
	}

	public Snake(int viciousness, boolean venomous)
	{
		this.viciousness = viciousness;
		this.venomous = venomous;
	}
}
