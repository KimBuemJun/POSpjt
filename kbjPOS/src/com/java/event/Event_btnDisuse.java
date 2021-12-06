package com.java.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.java.frame.Disuseframe;
import com.java.frame.Mainframe;

public class Event_btnDisuse implements ActionListener {
	static Mainframe mf;
	static Disuseframe df;
	
	public Event_btnDisuse(Mainframe mf) {
		this.mf = mf;
	}
	
	public void actionPerformed(ActionEvent e) {
		df = new Disuseframe();
		mf.setVisible(false);
	}
}
