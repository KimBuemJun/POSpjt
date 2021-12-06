package com.java.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.java.frame.Mainframe;
import com.java.frame.Registrationframe;

public class Event_btnRegistration implements ActionListener {
	static Mainframe mf;
	static Registrationframe rf;
	
	public Event_btnRegistration(Mainframe mf) {
		this.mf = mf;
	}
	
	public void actionPerformed(ActionEvent e) {
		rf = new Registrationframe();
		mf.setVisible(false);
	}
}
