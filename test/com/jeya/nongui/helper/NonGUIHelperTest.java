package com.jeya.nongui.helper;

import com.jeya.nongui.helper.NonGUIHelper;

import junit.framework.TestCase;
//import org.junit.Test;

public class NonGUIHelperTest extends TestCase{
	boolean i1;
	boolean i2;
	
	public void setup()
	{
	}
	
	//@Test
	public void testSetCancelStatus() {
		i1 = true;
		i2 = true;
		assertTrue(NonGUIHelper.setCancelStatus(i1, i2));
		
		i1 = true;
		i2 = false;
		assertFalse(NonGUIHelper.setCancelStatus(i1, i2));
		
		i1 = false;
		i2 = true;
		assertFalse(NonGUIHelper.setCancelStatus(i1, i2));
		
		
		i1 = false;
		i2 = false;
		assertFalse(NonGUIHelper.setCancelStatus(i1, i2));
	}

}
