package org.jointheleague.elon;

import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;

public class RealFlorist implements Florist
{
	@Override
	public void orderFlowers()
	{
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		try
		{
			URL myURL = new URL("http://freddytheflorist.com/");
			URLConnection myURLConnection = myURL.openConnection();
			myURLConnection.setRequestProperty("message", "hey bae");
			myURLConnection.setRequestProperty("from", "<3 Elon");
			myURLConnection.connect();

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
