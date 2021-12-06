package com.java.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.java.frame.Registrationframe;

public class Event_btnCancelinRf implements ActionListener {
	Registrationframe rf;
	
	public Event_btnCancelinRf(Registrationframe rf) {
		this.rf = rf;
	}
	
	public void actionPerformed(ActionEvent e) {
		rf.dispose();
		Event_btnSelling.mf.setVisible(true);
	}
}
