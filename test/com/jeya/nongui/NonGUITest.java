package com.jeya.nongui;

import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

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
	
	public void testCallByAMockedClassMethodWithReturnTypeShouldBeOneOfTheArgument()
	{
		ServerClassData data = Mockito.mock(ServerClassData.class);
		Mockito.when(data.getWorkDone((ComplexData)Mockito.any(), Mockito.anyString(), Mockito.anyInt())).then(
		new Answer<ComplexData>() {

			@Override
			public ComplexData answer(InvocationOnMock invocation) throws Throwable {
	            return (ComplexData) (invocation.getArguments()[0]); // the first argument should be returned back
			}
		});
		NonGUI nonGui = new NonGUI();
		nonGui.setData(data);
		ComplexData d = nonGui.callByAMockedClassMethodWithReturnTypeShouldBeOneOfTheArgument("2", 2);
		assertEquals(3, d.getN());
	}
}
