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
		setTitle("POS ���α׷�");
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 750);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setBackground(new Color(176, 196, 222));
		contentPane.setLayout(null);
		
		JButton btnSelling = new JButton("��ǰ �Ǹ�");
		btnSelling.setBackground(new Color(255, 255, 255));
		btnSelling.setBounds(82, 90, 250, 100);
		btnSelling.setFont(new Font("���� ���", Font.PLAIN, 24));
		btnSelling.addActionListener(new Event_btnSelling(this));
		contentPane.add(btnSelling);
		
		JButton btnOrdering = new JButton("��ǰ ����");
		btnOrdering.setBackground(new Color(255, 255, 255));
		btnOrdering.setBounds(460, 90, 250, 100);
		btnOrdering.setFont(new Font("���� ���", Font.PLAIN, 24));
		btnOrdering.addActionListener(new Event_btnOrdering(this));
		contentPane.add(btnOrdering);
		
		JButton btnInquiry = new JButton("��ǰ ��ȸ");
		btnInquiry.setBackground(new Color(255, 255, 255));
		btnInquiry.setBounds(122, 270, 170, 60);
		btnInquiry.setFont(new Font("���� ���", Font.BOLD, 16));
		btnInquiry.addActionListener(new Event_btnInquiry(this));
		contentPane.add(btnInquiry);
		
		JButton btnRegistration = new JButton("��ǰ ���");
		btnRegistration.setBackground(new Color(255, 255, 255));
		btnRegistration.setBounds(502, 270, 170, 60);
		btnRegistration.setFont(new Font("���� ���", Font.BOLD, 16));
		btnRegistration.addActionListener(new Event_btnRegistration(this));
		contentPane.add(btnRegistration);
		
		JButton btnHistory = new JButton("�Ǹ� ���� ��ȸ");
		btnHistory.setBackground(new Color(255, 255, 255));
		btnHistory.setBounds(122, 410, 170, 60);
		btnHistory.setFont(new Font("���� ���", Font.BOLD, 16));
		btnHistory.addActionListener(new Event_btnHistory(this));
		contentPane.add(btnHistory);
		
		JButton btnDisuse = new JButton("��� ���");
		btnDisuse.setBackground(new Color(255, 255, 255));
		btnDisuse.setBounds(502, 410, 170, 60);
		btnDisuse.setFont(new Font("���� ���", Font.BOLD, 16));
		btnDisuse.addActionListener(new Event_btnDisuse(this));
		contentPane.add(btnDisuse);
		
		JButton btnSales = new JButton("���� ��ȸ");
		btnSales.setBackground(new Color(255, 255, 255));
		btnSales.setBounds(122, 550, 170, 60);
		btnSales.setFont(new Font("���� ���", Font.BOLD, 16));
		contentPane.add(btnSales);
		
		JButton btnMember = new JButton("ȸ�� ���");
		btnMember.setBackground(new Color(255, 255, 255));
		btnMember.setBounds(502, 550, 170, 60);
		btnMember.setFont(new Font("���� ���", Font.BOLD, 16));
		btnMember.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				if (i == 0) {
					memf = new Memberframe();
					i = 1;
				}
				else {
					if(memf.isShowing() == true) {
					JOptionPane.showMessageDialog(null, "�̹� â�� �����ֽ��ϴ�.");
					}
					else memf = new Memberframe();
				}
			}
		});
		contentPane.add(btnMember);
	}
}
