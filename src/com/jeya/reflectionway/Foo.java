package com.jeya.reflectionway;

public class Foo extends AbstractFoo {
	private String privateFieldToTest;

	public String publicMethodInSubClassCallCallerOfPrivateMethodInAbstractClass() {
		String fromSuper = super.callerOfPrivateMethodInAbstractClass();
		return fromSuper + ": publicMethodInSubClassCallCallerOfPrivateMethodInAbstractClass";
	}

	@Override
	protected void setPrivateFieldToTest(String test) {
		this.privateFieldToTest = test;
	}
}
