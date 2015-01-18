package org.jointheleague.missye;

import java.awt.Color;

public class WorkIt
{
	void putMyThingDown(Singer missyE)
	{
		flipIt(missyE);
	}

	void flipIt(Singer missyE)
	{
		reverseIt(missyE);
	}

	void reverseIt(Singer missyE)
	{
		System.out.println(missyE.getMissySneakerSize() + missyE.getBling() + missyE.getMissyCapColor());
	}
}
