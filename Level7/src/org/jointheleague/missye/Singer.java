package org.jointheleague.missye;

import java.awt.Color;

public class Singer
{
	private int missySneakerSize;
	private Color missyCapColor;
	private String bling;
	private int numberOfGrammyAwards;
	private boolean supaDupaFly;

	public int getMissySneakerSize()
	{
		return missySneakerSize;
	}

	public Color getMissyCapColor()
	{
		return missyCapColor;
	}

	public String getBling()
	{
		return bling;
	}

	public int getNumberOfGrammyAwards()
	{
		return numberOfGrammyAwards;
	}

	public boolean isSupaDupaFly()
	{
		return supaDupaFly;
	}

	public Singer(int missySneakerSize, Color missyCapColor, String bling, int numberOfGrammyAwards, boolean isSupaDupaFly)
	{
		this.missySneakerSize = missySneakerSize;
		this.missyCapColor = missyCapColor;
		this.bling = bling;
		this.numberOfGrammyAwards = numberOfGrammyAwards;
		this.supaDupaFly = isSupaDupaFly;
	}
}