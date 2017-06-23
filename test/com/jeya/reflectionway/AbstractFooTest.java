package com.jeya.reflectionway;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import junit.framework.TestCase;

public class AbstractFooTest extends TestCase {

	public void testPrivateMethodInAbstractClass() throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method method = AbstractFoo.class.getDeclaredMethod("privateMethodInAbstractClass");
		method.setAccessible(true);

		AbstractFoo abstractFoo = new Foo();
		method.invoke(abstractFoo);
	}
}
