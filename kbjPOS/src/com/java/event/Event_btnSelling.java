package com.java.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.java.frame.Mainframe;
import com.java.frame.Sellingframe;

public class Event_btnSelling implements ActionListener {
	static Mainframe mf;
	static Sellingframe sf;
	
	public Event_btnSelling(Mainframe mf) {
		this.mf = mf;
	}
	
	public void actionPerformed(ActionEvent e) {
		sf = new Sellingframe();
		mf.setVisible(false);
	}
}
