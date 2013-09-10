package com.osa.application;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {
	private HelloWorld h;

	@Before
	public void setUp() throws Exception {
		h = new HelloWorld();
	}

	@SuppressWarnings("static-access")
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals("We keep it rockin!", h.getMessage());
	}

}
