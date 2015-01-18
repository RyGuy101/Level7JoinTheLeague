package org.jointheleague.vicfix;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class EmailUpdater
{
	private StringBuilder fileContents = new StringBuilder();

	public static void main(String[] args) throws IOException
	{
		new EmailUpdater().updateEmails();
	}

	private void updateEmails() throws IOException
	{
		URL fileWithEmails = getClass().getResource("emails.txt");

		Scanner scanner = new Scanner(fileWithEmails.openStream());

		while (scanner.hasNextLine())
		{
			fileContents.append(scanner.nextLine());
		}
		scanner.close();

		while (fileContents.indexOf("wintriss") != -1)
		{
			replaceOldDomain();
		}

		// save the updated file
		FileWriter fw = new FileWriter(fileWithEmails.getPath());
		fw.write(fileContents.toString());
		fw.close();
	}

	public void replaceOldDomain()
	{
		int startOfOldDomain = fileContents.indexOf("@wintrisstech");
		int endOfOldDomain = fileContents.indexOf(".org", startOfOldDomain);
		fileContents.replace(startOfOldDomain, endOfOldDomain, "@jointheleague");
	}

	public StringBuilder getFileContents()
	{
		return fileContents;
	}

	public void setFileContents(StringBuilder fileContents)
	{
		this.fileContents = fileContents;
	}
}
