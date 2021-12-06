package com.java.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.java.frame.Mainframe;
import com.java.frame.Orderingframe;

public class Event_btnOrdering implements ActionListener {
	static Mainframe mf;
	static Orderingframe of;
	
	public Event_btnOrdering(Mainframe mf) {
		this.mf = mf;
	}
	
	public void actionPerformed(ActionEvent e) {
		of = new Orderingframe();
		mf.setVisible(false);
	}
}
