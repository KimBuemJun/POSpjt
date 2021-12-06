package com.java.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.java.frame.Historyframe;

public class Event_btnCancelinHf implements ActionListener {
	Historyframe hf;
	
	public Event_btnCancelinHf(Historyframe hf) {
		this.hf = hf;
	}
	
	public void actionPerformed(ActionEvent e) {
		hf.dispose();
		Event_btnSelling.mf.setVisible(true);
	}
}
