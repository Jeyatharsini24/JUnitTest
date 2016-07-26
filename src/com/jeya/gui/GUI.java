package com.jeya.gui;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
// 		Mockito m;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/** Bottom Button should be enabled if TopA and TopB are clicked only */
/** Gonna to test that in test class*/
/** Need helper class since the logic to check is inside constructor */
/** Just to demonstrate Mockito's usage */
public class GUI extends JFrame{
	private JButton btnTopA;
	private JButton btnTopB;
	private JButton btnBottom;

	public GUI()
	{
		initialFrameSetup();
		addComponents();
		initialSetup();
		addListeners();
	}
	
	private void addListeners() {
		btnTopA.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				btnTopA.setEnabled(false);
				setBottomButton();
			}});
		btnTopB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnTopB.setEnabled(false);
				setBottomButton();
			}
		});
		btnBottom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btnBottom.setEnabled(false);
				btnTopA.setEnabled(true);
				btnTopB.setEnabled(true);
			}
		});
	}

	protected void setBottomButton() {
		if(!btnTopA.isEnabled() && !btnTopB.isEnabled())
		{
			btnBottom.setEnabled(true);
		}
	}

	private void addComponents() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		btnTopA = new JButton("Enable Bottom Button A");
		panel.add(btnTopA);
		
		btnTopB = new JButton("Enable Bottom Button B");
		panel.add(btnTopB);
		
		btnBottom = new JButton("Will Active if A and B is clicked");
		panel.add(btnBottom);
	}

	private void initialSetup() {
		btnBottom.setEnabled(false);
	}
	
	private void initialFrameSetup() {
		setSize(249,254);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}