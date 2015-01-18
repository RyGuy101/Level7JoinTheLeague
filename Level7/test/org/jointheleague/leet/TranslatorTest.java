package org.jointheleague.leet;

import static org.junit.Assert.*;

import org.junit.Test;
import org.omg.PortableInterceptor.SUCCESSFUL;

public class TranslatorTest {

	@Test
	public void testTranslate() {
		Translator translator = new Translator();
		assertEquals("h3110 w0r1d", translator.translate("Hello World"));
		assertEquals("i 8 y0u", translator.translate("I ate you"));
	}

}
