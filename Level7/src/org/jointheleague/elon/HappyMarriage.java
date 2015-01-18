package org.jointheleague.elon;

import java.net.URL;
import java.net.URLConnection;
import java.util.Calendar;
import java.util.Properties;
import java.util.TimeZone;

/**
 * Last year, Elon Musk forgot to send flowers to his wife on Valentine’s day.
 * She divorced him and it cost him a ton of money. He has written a script that
 * will run on a server and automatically order flowers every year. The florist
 * will automatically charge his credit card. He wants you to write a test to
 * make sure that the message will get sent on Valentine’s day and no other day.
 * Try not to mess up or Elon won’t let you go to Mars.
 **/

public class HappyMarriage
{
	void sendFlowersOnValentinesDay()
	{
		sendFlowersOnValentinesDay(new RealFlorist(), Calendar.getInstance(TimeZone.getDefault()));
	}

	void sendFlowersOnValentinesDay(Florist florist, Calendar calendar)
	{
		Calendar localCalendar = calendar;
		int currentDay = localCalendar.get(Calendar.DATE);
		int currentMonth = localCalendar.get(Calendar.MONTH);

		if (currentDay == 14 && currentMonth == 2)
		{
			florist.orderFlowers();
		}
	}
}
