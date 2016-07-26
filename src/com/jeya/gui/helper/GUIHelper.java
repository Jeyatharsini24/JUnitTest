package com.jeya.gui.helper;

import javax.swing.JButton;

public class GUIHelper {
	public static boolean setBottomButtonStatus(JButton btnTopA, JButton btnTopB)
	{
		if(!btnTopA.isEnabled() && !btnTopB.isEnabled())
		{
			return true;
		}
		return false;
	}
}
