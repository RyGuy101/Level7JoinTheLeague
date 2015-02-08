package org.jointheleague.snakesonaplane;

import java.util.Random;

public class SnakeFactory
{
	public static Snake createSnake()
	{
		return new Snake(new Random().nextInt(9) + 1, new Random().nextBoolean());
	}
}
