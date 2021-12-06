package com.java.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.java.frame.*;

public class Event_btnCancelinIqf implements ActionListener {
	Inquiryframe iqf;
	
	public Event_btnCancelinIqf(Inquiryframe iqf) {
		this.iqf = iqf;
	}
	
	public void actionPerformed(ActionEvent e) {
		iqf.dispose();
		Event_btnSelling.mf.setVisible(true);
	}
}
