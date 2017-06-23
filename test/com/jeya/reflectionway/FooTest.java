package com.jeya.reflectionway;

import java.lang.reflect.Field;

import junit.framework.TestCase;

public class FooTest extends TestCase{

	public void testSetPrivateFieldToTest()
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field field = Foo.class.getDeclaredField("privateFieldToTest");
		field.setAccessible(true);
		Foo foo = new Foo();
		foo.setPrivateFieldToTest("setPrivateFieldToTest");
		assertEquals("setPrivateFieldToTest", (String) field.get(foo));
	}
}
