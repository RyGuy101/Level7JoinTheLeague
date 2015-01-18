package org.jointheleague.vicfix;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmailUpdater
{

	@Test
	public void testReplaceOldDomain()
	{
		EmailUpdater vicsEmailUpdater = new EmailUpdater();
		CharSequence emails = "ryan@wintrisstech.org";
		vicsEmailUpdater.setFileContents(new StringBuilder(emails));
		vicsEmailUpdater.replaceOldDomain();
		assertEquals("ryan@jointheleague.org", vicsEmailUpdater.getFileContents().toString());
	}

}
