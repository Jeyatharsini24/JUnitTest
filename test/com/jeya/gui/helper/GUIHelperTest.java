package com.jeya.gui.helper;

import javax.swing.JButton;

import junit.framework.TestCase;

import org.mockito.Mockito;

public class GUIHelperTest extends TestCase{
	/**
	  mock is used for GUI components and server classes
	 */
	private static JButton btnTopA = Mockito.mock(JButton.class);
	private static JButton btnTopB = Mockito.mock(JButton.class);

	public void testSetBottomButtonStatusBothAreClicked() 
	{		
	    Mockito.when(btnTopA.isEnabled()).thenReturn(false);
	    Mockito.when(btnTopB.isEnabled()).thenReturn(false);
		assertTrue(GUIHelper.setBottomButtonStatus(btnTopA, btnTopB));
	}
	
	public void testSetBottomButtonStatusOnlyBIsClicked()
	{
		Mockito.when(btnTopA.isEnabled()).thenReturn(false);
	    Mockito.when(btnTopB.isEnabled()).thenReturn(true);
		assertFalse(GUIHelper.setBottomButtonStatus(btnTopA, btnTopB));
	}
	
	public void testSetBottomButtonStatusOnlyAIsClicked()
	{
		Mockito.when(btnTopA.isEnabled()).thenReturn(true);
	    Mockito.when(btnTopB.isEnabled()).thenReturn(false);
		assertFalse(GUIHelper.setBottomButtonStatus(btnTopA, btnTopB));
	}
	
	public void testSetBottomButtonStatusBothAreNotClicked()
	{
		Mockito.when(btnTopA.isEnabled()).thenReturn(true);
	    Mockito.when(btnTopB.isEnabled()).thenReturn(true);
		assertFalse(GUIHelper.setBottomButtonStatus(btnTopA, btnTopB));
	}
}
