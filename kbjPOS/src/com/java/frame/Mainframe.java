package com.java.frame;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.java.event.*;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mainframe extends JFrame {
	private JPanel contentPane;
	
	static Memberframe memf;
	int i = 0;
	
	public Mainframe() {
		setTitle("POS «¡∑Œ±◊∑•");
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 750);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setBackground(new Color(176, 196, 222));
		contentPane.setLayout(null);
		
		JButton btnSelling = new JButton("ªÛ«∞ ∆«∏≈");
		btnSelling.setBackground(new Color(255, 255, 255));
		btnSelling.setBounds(82, 90, 250, 100);
		btnSelling.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 24));
		btnSelling.addActionListener(new Event_btnSelling(this));
		contentPane.add(btnSelling);
		
		JButton btnOrdering = new JButton("ªÛ«∞ πﬂ¡÷");
		btnOrdering.setBackground(new Color(255, 255, 255));
		btnOrdering.setBounds(460, 90, 250, 100);
		btnOrdering.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 24));
		btnOrdering.addActionListener(new Event_btnOrdering(this));
		contentPane.add(btnOrdering);
		
		JButton btnInquiry = new JButton("ªÛ«∞ ¡∂»∏");
		btnInquiry.setBackground(new Color(255, 255, 255));
		btnInquiry.setBounds(122, 270, 170, 60);
		btnInquiry.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 16));
		btnInquiry.addActionListener(new Event_btnInquiry(this));
		contentPane.add(btnInquiry);
		
		JButton btnRegistration = new JButton("ªÛ«∞ µÓ∑œ");
		btnRegistration.setBackground(new Color(255, 255, 255));
		btnRegistration.setBounds(502, 270, 170, 60);
		btnRegistration.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 16));
		btnRegistration.addActionListener(new Event_btnRegistration(this));
		contentPane.add(btnRegistration);
		
		JButton btnHistory = new JButton("∆«∏≈ ≥ªø™ ¡∂»∏");
		btnHistory.setBackground(new Color(255, 255, 255));
		btnHistory.setBounds(122, 410, 170, 60);
		btnHistory.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 16));
		btnHistory.addActionListener(new Event_btnHistory(this));
		contentPane.add(btnHistory);
		
		JButton btnDisuse = new JButton("∆Û±‚ µÓ∑œ");
		btnDisuse.setBackground(new Color(255, 255, 255));
		btnDisuse.setBounds(502, 410, 170, 60);
		btnDisuse.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 16));
		btnDisuse.addActionListener(new Event_btnDisuse(this));
		contentPane.add(btnDisuse);
		
		JButton btnSales = new JButton("∏≈√‚ ¡∂»∏");
		btnSales.setBackground(new Color(255, 255, 255));
		btnSales.setBounds(122, 550, 170, 60);
		btnSales.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 16));
		contentPane.add(btnSales);
		
		JButton btnMember = new JButton("»∏ø¯ µÓ∑œ");
		btnMember.setBackground(new Color(255, 255, 255));
		btnMember.setBounds(502, 550, 170, 60);
		btnMember.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 16));
		btnMember.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				if (i == 0) {
					memf = new Memberframe();
					i = 1;
				}
				else {
					if(memf.isShowing() == true) {
					JOptionPane.showMessageDialog(null, "¿ÃπÃ √¢¿Ã ø≠∑¡¿÷Ω¿¥œ¥Ÿ.");
					}
					else memf = new Memberframe();
				}
			}
		});
		contentPane.add(btnMember);
	}
}
