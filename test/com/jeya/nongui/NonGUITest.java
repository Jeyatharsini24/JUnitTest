package com.jeya.nongui;

import org.mockito.Mockito;

import com.jeya.server.data.ServerClassData;

import junit.framework.TestCase;

public class NonGUITest extends TestCase{

	public void testMockServerClasses() {
		ServerClassData data = Mockito.mock(ServerClassData.class);
		
		NonGUI nonGui = new NonGUI();
		nonGui.setData(data);
		nonGui.mockServerClasses();
		Mockito.verify(data).setWorkDone(true);// check whether setWorkDone(true) is invoked
	}
}
