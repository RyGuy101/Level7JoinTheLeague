package org.jointheleague.spoon;

import java.awt.image.SinglePixelPackedSampleModel;

import junit.framework.TestCase;

public class SpoonTest extends TestCase
{

	/* Fill in the test code for each method and run them one at a time. */

	// public void testSpoonCanBeObtained() throws Exception
	// {
	// assertNotNull(SingleSpoon.getTheSpoon());
	// }

	// public void testSpoonCanOnlyBeObtainedOnce() throws Exception
	// {
	// assertNotNull(SingleSpoon.getTheSpoon());
	// assertNull(SingleSpoon.getTheSpoon());
	// assertNull(SingleSpoon.getTheSpoon());
	// }
	//
	// public void testSpoonCanBeObtainedAfterItHasBeenReturned() throws
	// Exception
	// {
	// SingleSpoon.returnTheSpoon();
	// assertNotNull(SingleSpoon.getTheSpoon());
	// }
	//
	// public void testExceptionIsThrownWhenSpoonIsNotAvailable() throws
	// Exception
	// {
	// SingleSpoon.getTheSpoon();
	// }

	public void testAllSpoonStuff()
	{
		// testSpoonCanOnlyBeObtainedOnce
		assertNotNull(SingleSpoon.getTheSpoon());
		assertNull(SingleSpoon.getTheSpoon());
		assertNull(SingleSpoon.getTheSpoon());

		// testSpoonCanBeObtainedAfterItHasBeenReturned()
		SingleSpoon.returnTheSpoon();
		assertNotNull(SingleSpoon.getTheSpoon());

		// testExceptionIsThrownWhenSpoonIsNotAvailable
		SingleSpoon.getTheSpoon();
	}
}