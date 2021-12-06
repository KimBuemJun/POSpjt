package com.java.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.java.frame.*;

public class Event_btnCancelinSf implements ActionListener {
	Sellingframe sf;
	
	public Event_btnCancelinSf(Sellingframe sf) {
		this.sf = sf;
	}
	
	public void actionPerformed(ActionEvent e) {
		sf.dispose();
		Event_btnSelling.mf.setVisible(true);
	}
}
