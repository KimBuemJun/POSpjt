package com.java.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.java.frame.*;

public class Event_btnCancelinOf implements ActionListener {
	Orderingframe of;
	
	public Event_btnCancelinOf(Orderingframe of) {
		this.of = of;
	}
	
	public void actionPerformed(ActionEvent e) {
		of.dispose();
		Event_btnSelling.mf.setVisible(true);
	}
}
