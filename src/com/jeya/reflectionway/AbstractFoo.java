package com.jeya.reflectionway;

public abstract class AbstractFoo {
	
	protected String callerOfPrivateMethodInAbstractClass()
	{
		String fromPrivateMethod = privateMethodInAbstractClass();
		return fromPrivateMethod + ": callerOfPrivateMethodInAbstractClass";
	}
	
	private String privateMethodInAbstractClass()
	{
		return "privateMethodInAbstractClass";
	}
	
	protected abstract void setPrivateFieldToTest(String test);
}