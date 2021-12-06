package com.java.frame;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.java.event.*;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Color;
import java.awt.SystemColor;

public class Orderingframe extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtSearch;
	
	public Orderingframe() {

		JPanel jpSearch = new JPanel();
		JButton btnSearch = new JButton("�˻�");

		JPanel jpAdd = new JPanel();
		JList listSearchResult = new JList();
		JButton btnAdd = new JButton("�߰�");

		JPanel jpAdded = new JPanel();
		JList listAdded = new JList();
		JButton btnSubtract = new JButton("���� ���");
		
		JButton btnOrder = new JButton("����");
		JButton btnCancel = new JButton("���");
		
		setTitle("��ǰ ����");
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
		
		// �߰� �г� ---------------------------------------------------------------------------------
		jpAdd.setBackground(SystemColor.inactiveCaption);
		jpAdd.setBounds(0, 90, 784, 220);
		contentPane.add(jpAdd);
		jpAdd.setLayout(null);
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
		listSearchResult.setBounds(31, 10, 591, 200);
		jpAdd.add(listSearchResult);
		// �߰� ��ư
		btnAdd.setBackground(new Color(255, 255, 255));
		btnAdd.setFont(new Font("���� ���", Font.PLAIN, 17));
		btnAdd.setBounds(650, 171, 111, 33);
		jpAdd.add(btnAdd);
		
		// �߰��� ��ǰ �г� ---------------------------------------------------------------------------------
		jpAdded.setBackground(SystemColor.inactiveCaption);
		jpAdded.setBounds(0, 320, 784, 250);
		contentPane.add(jpAdded);
		jpAdded.setLayout(null);
		// �߰��� ��ǰ ����Ʈ
		listAdded.setFont(new Font("���� ���", Font.PLAIN, 15));
		listAdded.setBounds(31, 10, 591, 210);
		jpAdded.add(listAdded);
		// ���� ��� ��ư
		btnSubtract.setFont(new Font("���� ���", Font.PLAIN, 17));
		btnSubtract.setBackground(Color.WHITE);
		btnSubtract.setBounds(650, 187, 111, 33);
		jpAdded.add(btnSubtract);
		
		// ���� ��ư
		btnOrder.setFont(new Font("���� ���", Font.PLAIN, 17));
		btnOrder.setBackground(Color.WHITE);
		btnOrder.setBounds(248, 598, 111, 33);
		contentPane.add(btnOrder);
		// ��� ��ư
		btnCancel.setToolTipText("");
		btnCancel.setFont(new Font("���� ���", Font.PLAIN, 17));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(425, 598, 111, 33);
		btnCancel.addActionListener(new Event_btnCancelinOf(this));
		contentPane.add(btnCancel);
	}
}
