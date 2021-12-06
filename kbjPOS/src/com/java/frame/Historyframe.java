package com.java.frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.java.event.Event_btnCancelinHf;
import com.java.event.Event_btnCancelinOf;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JList;
import java.awt.Color;
import java.awt.SystemColor;

public class Historyframe extends JFrame {
	
	private JPanel contentPane;
	
	public Historyframe() {

		JPanel panel = new JPanel();
		JList list = new JList();

		JButton btnCancel = new JButton("확인");
		
		setTitle("판매 내역 조회");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 700);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(0, 0, 784, 574);
		contentPane.add(panel);
		panel.setLayout(null);
		
		list.setBounds(31, 30, 722, 505);
		panel.add(list);
		
		//-------------------------------------------------------------------------
		btnCancel.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(337, 598, 111, 33);
		btnCancel.addActionListener(new Event_btnCancelinHf(this));
		contentPane.add(btnCancel);
	}
}
