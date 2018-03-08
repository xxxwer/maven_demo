package com.xxxwer.md4.md4_service;

import org.junit.*;
import org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	@Test
	public void testMain()
    {
		String[] x = null;
		Assert.assertEquals("Hello World!", new App().main(x));
    }
}
