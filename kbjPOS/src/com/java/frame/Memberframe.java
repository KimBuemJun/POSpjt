package com.java.frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Memberframe extends JFrame {

	private JPanel contentPane;
	private JTextField txtMbName;
	private JTextField txtMbPhonenum;
	
	public Memberframe() {

		JPanel jpMember = new JPanel();
		JLabel lbMbName = new JLabel("����");
		JLabel lbMbPhonenum = new JLabel("��ȭ��ȣ");
		
		JButton btnMemberRg = new JButton("���");
		JButton btnCancel = new JButton("���");
		
		setTitle("ȸ�� ���");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 590, 225);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		jpMember.setBackground(SystemColor.inactiveCaption);
		jpMember.setBounds(12, 10, 550, 117);
		contentPane.add(jpMember);
		jpMember.setLayout(null);
		
		lbMbName.setHorizontalAlignment(SwingConstants.CENTER);
		lbMbName.setFont(new Font("���� ����", Font.PLAIN, 15));
		lbMbName.setBounds(12, 20, 80, 25);
		jpMember.add(lbMbName);
		
		lbMbPhonenum.setHorizontalAlignment(SwingConstants.CENTER);
		lbMbPhonenum.setFont(new Font("���� ����", Font.PLAIN, 15));
		lbMbPhonenum.setBounds(12, 60, 80, 25);
		jpMember.add(lbMbPhonenum);
		
		txtMbName = new JTextField();
		txtMbName.setFont(new Font("���� ����", Font.PLAIN, 15));
		txtMbName.setBounds(104, 18, 430, 30);
		jpMember.add(txtMbName);
		txtMbName.setColumns(10);
		
		txtMbPhonenum = new JTextField();
		txtMbPhonenum.setFont(new Font("���� ����", Font.PLAIN, 15));
		txtMbPhonenum.setColumns(10);
		txtMbPhonenum.setBounds(104, 60, 430, 30);
		jpMember.add(txtMbPhonenum);
		
		btnMemberRg.setFont(new Font("���� ����", Font.PLAIN, 15));
		btnMemberRg.setBounds(130, 137, 111, 33);
		contentPane.add(btnMemberRg);
		
		btnCancel.setFont(new Font("���� ����", Font.PLAIN, 15));
		btnCancel.setBounds(333, 137, 111, 33);
		btnCancel.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				dispose();
			}
		});
		contentPane.add(btnCancel);
	}
}
