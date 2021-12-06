package com.java.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.java.frame.Inquiryframe;
import com.java.frame.Mainframe;

public class Event_btnInquiry implements ActionListener {
	static Mainframe mf;
	static Inquiryframe iqf;
	
	public Event_btnInquiry(Mainframe mf) {
		this.mf = mf;
	}
	
	public void actionPerformed(ActionEvent e) {
		iqf = new Inquiryframe();
		mf.setVisible(false);
	}
}
