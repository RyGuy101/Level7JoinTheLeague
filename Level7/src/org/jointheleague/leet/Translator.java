package org.jointheleague.leet;

public class Translator
{
	public String translate(String message)
	{
		return message.toLowerCase().replaceAll("ate", "8").replaceAll("l", "1").replaceAll("t", "7").replaceAll("s", "5").replaceAll("a", "4").replaceAll("o", "0").replaceAll("e", "3");
	}
}
