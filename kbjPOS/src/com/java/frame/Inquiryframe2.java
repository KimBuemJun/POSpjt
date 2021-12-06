package com.java.frame;

import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Inquiryframe2 extends JFrame {
	
	private JPanel contentPane;
	
	public Inquiryframe2() {
		setTitle("»óÇ° Á¶È¸");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 250);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		JPanel jpInquiry = new JPanel();
		jpInquiry.setBounds(12, 10, 410, 153);
		contentPane.add(jpInquiry);
		jpInquiry.setLayout(null);
		
		JLabel lbName = new JLabel("ÀÌ¸§");
		lbName.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lbName.setBounds(12, 10, 386, 25);
		jpInquiry.add(lbName);
		
		JLabel lbAmount = new JLabel("¼ö·®");
		lbAmount.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lbAmount.setBounds(12, 45, 386, 25);
		jpInquiry.add(lbAmount);
		
		JLabel lbSellforweek = new JLabel("ÀÏÁÖÀÏµ¿¾È ÆÈ¸° °¹¼ö");
		lbSellforweek.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lbSellforweek.setBounds(12, 115, 386, 25);
		jpInquiry.add(lbSellforweek);
		
		JLabel lbCategory = new JLabel("Ä«Å×°í¸®");
		lbCategory.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lbCategory.setBounds(12, 80, 386, 25);
		jpInquiry.add(lbCategory);
		
		JButton btnOk = new JButton("È®ÀÎ");
		btnOk.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		btnOk.setBounds(162, 173, 111, 33);
		btnOk.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				dispose();
			}
		});

		contentPane.add(btnOk);
	}
}
