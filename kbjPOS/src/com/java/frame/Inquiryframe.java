package com.java.frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;

import com.java.event.*;

import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inquiryframe extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtSearch;
	
	static Inquiryframe2 Inqf2;
	
	public Inquiryframe() {
		
		JPanel jpSearch = new JPanel();
		JButton btnSearch = new JButton("�˻�");

		JPanel jpResult = new JPanel();
		JList listSearchResult = new JList();
		JButton btnInquiry2 = new JButton("��ǰ ��ȸ");
		
		JButton btnCancel = new JButton("���");
		
		setTitle("��ǰ ��ȸ");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 700);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		// �˻� �г� ---------------------------------------------------------------------------------
		jpSearch.setBackground(SystemColor.inactiveCaption);
		jpSearch.setBounds(0, 0, 784, 80);
		contentPane.add(jpSearch);
		jpSearch.setLayout(null);
		// �˻� �ؽ�Ʈ�ڽ�
		txtSearch = new JTextField();
		txtSearch.setBounds(31, 30, 591, 33);
		txtSearch.setFont(new Font("���� ���", Font.PLAIN, 15));
		jpSearch.add(txtSearch);
		txtSearch.setColumns(45);
		// �˻� ��ư
		btnSearch.setBackground(new Color(255, 255, 255));
		btnSearch.setBounds(650, 30, 111, 33);
		btnSearch.setFont(new Font("���� ���", Font.PLAIN, 17));
		jpSearch.add(btnSearch);
		
		// �˻� ��� �г� ---------------------------------------------------------------------------------
		jpResult.setBackground(SystemColor.inactiveCaption);
		jpResult.setBounds(0, 90, 784, 460);
		contentPane.add(jpResult);
		jpResult.setLayout(null);
		// �˻� ��� ����Ʈ
		listSearchResult.setFont(new Font("���� ���", Font.PLAIN, 15));
		listSearchResult.setVisibleRowCount(15);
		listSearchResult.setModel(new AbstractListModel() {
			String[] values = new String[] {"\uCC38\uCE58\uB9C8\uC694 \uC0BC\uAC01\uAE40\uBC25", "\uBC31\uC885\uC6D0 \uB3C4\uC2DC\uB77D", "\uCF54\uCE74\uCF5C\uB77C \uC81C\uB85C"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listSearchResult.setSelectedIndex(0);
		listSearchResult.setBounds(31, 10, 591, 430);
		jpResult.add(listSearchResult);
		// ��ȸ ��ư
		btnInquiry2.setBackground(new Color(255, 255, 255));
		btnInquiry2.setFont(new Font("���� ���", Font.PLAIN, 17));
		btnInquiry2.setBounds(650, 407, 111, 33);
		btnInquiry2.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				Inqf2 = new Inquiryframe2();
			}
		});
		jpResult.add(btnInquiry2);
		
		//------------------------------------------------------------------------------------------------
		// ��� ��ư
		btnCancel.setFont(new Font("���� ���", Font.PLAIN, 17));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(337, 598, 111, 33);
		btnCancel.addActionListener(new Event_btnCancelinIqf(this));
		contentPane.add(btnCancel);
	}
}
