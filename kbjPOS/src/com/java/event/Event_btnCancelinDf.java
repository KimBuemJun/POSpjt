package com.java.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.java.frame.Disuseframe;

public class Event_btnCancelinDf implements ActionListener {
	Disuseframe df;
	
	public Event_btnCancelinDf(Disuseframe df) {
		this.df = df;
	}
	
	public void actionPerformed(ActionEvent e) {
		df.dispose();
		Event_btnSelling.mf.setVisible(true);
	}
}
