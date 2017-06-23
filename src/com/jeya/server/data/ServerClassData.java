package com.jeya.server.data;

import com.jeya.nongui.ComplexData;

public class ServerClassData {
	boolean done;
	public void setWorkDone(boolean done)
	{
		this.done = done;
	}
	public ComplexData getWorkDone(ComplexData d, String s, int n) {
		d.setS(s);
		return d;
	}
}