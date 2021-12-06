package com.java.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.java.frame.Mainframe;
import com.java.frame.Historyframe;

public class Event_btnHistory implements ActionListener {
	static Mainframe mf;
	static Historyframe hf;
	
	public Event_btnHistory(Mainframe mf) {
		this.mf = mf;
	}
	
	public void actionPerformed(ActionEvent e) {
		hf = new Historyframe();
		mf.setVisible(false);
	}
}
