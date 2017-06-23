package com.jeya.nongui;

import com.jeya.server.data.ServerClassData;

public class NonGUI {
	private ServerClassData data;
	// private methods need helper class to be accessed by unit tests.
	private void setCancelStatus()
	{
		boolean i1 = true; boolean i2 = false;
		boolean cancel = i1 && i2;
	}
	
	public void setData(ServerClassData data)
	{
		this.data = data;
	}
	
	protected void mockServerClasses()
	{
		data.setWorkDone(true);
	}
	
	protected ComplexData callByAMockedClassMethodWithReturnTypeShouldBeOneOfTheArgument(String s, int n)
	{
		ComplexData d = data.getWorkDone(new ComplexData("1", 1), s, n);
		d.setN(3);
		return d;
	}
}
