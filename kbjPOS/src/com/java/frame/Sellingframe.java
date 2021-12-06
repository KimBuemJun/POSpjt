package com.java.frame;

import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.java.event.*;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ItemEvent;

import javax.swing.DropMode;

public class Sellingframe extends JFrame {
	private JPanel contentPane;
	private JTextField txtSearch;
	private JTextField txtMDiscount;
	private JTextField txtDiscount;
	private JTextField txtSum;
	
	public Sellingframe() {
		

		JPanel jpSearch = new JPanel();
		JButton btnSearch = new JButton("�˻�");
		
		JPanel jpAdd = new JPanel();
		JList listSearchResult = new JList();
		JButton btnAdd = new JButton("��ǰ �߰�");

		JPanel jpSum = new JPanel();
		JList listAdded = new JList();
		JCheckBox chckbxMDiscount = new JCheckBox("ȸ�� ����");
		JButton btnApply = new JButton("����");
		JButton btnSubtract = new JButton("���� ���");
		
		JButton btnPay = new JButton("����");
		JButton btnCancel = new JButton("���");
		
		setTitle("��ǰ �Ǹ�");
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
		btnAdd.setBounds(649, 171, 111, 33);
		jpAdd.add(btnAdd);
		
		// �հ� �г� ---------------------------------------------------------------------------------
		jpSum.setBackground(SystemColor.inactiveCaption);
		jpSum.setBounds(0, 320, 784, 250);
		contentPane.add(jpSum);
		jpSum.setLayout(null);
		// �߰��� ��ǰ ����Ʈ
		listAdded.setFont(new Font("���� ���", Font.PLAIN, 15));
		listAdded.setBounds(31, 10, 591, 150);
		jpSum.add(listAdded);
		// ���� �ؽ�Ʈ�ڽ� - ���ε� �ݾ��� ���
		txtDiscount = new JTextField();
		txtDiscount.setText("���� : ");
		txtDiscount.setBackground(SystemColor.text);
		txtDiscount.setEditable(false);
		txtDiscount.setFont(new Font("���� ���", Font.PLAIN, 15));
		txtDiscount.setBounds(30, 160, 593, 30);
		jpSum.add(txtDiscount);
		txtDiscount.setColumns(10);
		// �հ� �ؽ�Ʈ�ڽ� - �հ� �ݾ��� ���
		txtSum = new JTextField();
		txtSum.setBackground(SystemColor.text);
		txtSum.setText("�հ� : ");
		txtSum.setFont(new Font("���� ���", Font.PLAIN, 15));
		txtSum.setEditable(false);
		txtSum.setColumns(10);
		txtSum.setBounds(30, 189, 593, 30);
		jpSum.add(txtSum);
		// ȸ�� ���� üũ�ڽ�
		chckbxMDiscount.setBackground(SystemColor.inactiveCaption);
		chckbxMDiscount.setFont(new Font("���� ���", Font.PLAIN, 15));
		chckbxMDiscount.setBounds(648, 133, 115, 23);
		chckbxMDiscount.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				try {
					if ( e.getStateChange() == ItemEvent.SELECTED ) {
						txtMDiscount.setEnabled(true);
						btnApply.setEnabled(true);
					}
					else {
						txtMDiscount.setEnabled(false);
						btnApply.setEnabled(false);
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				} finally {
					
				}	
			}
		});
		jpSum.add(chckbxMDiscount);
		// ���id �ؽ�Ʈ - ��ȭ��ȣ�� �Է�
		txtMDiscount = new JTextField();
		txtMDiscount.setEnabled(false);
		txtMDiscount.setText("010");
		txtMDiscount.setFont(new Font("���� ���", Font.PLAIN, 15));
		txtMDiscount.setBounds(648, 162, 116, 23);
		jpSum.add(txtMDiscount);
		txtMDiscount.setColumns(11);
		// ���� ��ư
		btnApply.setEnabled(false);
		btnApply.setFont(new Font("���� ���", Font.PLAIN, 12));
		btnApply.setBackground(SystemColor.text);
		btnApply.setBounds(658, 195, 96, 23);
		jpSum.add(btnApply);
		// ���� ��� ��ư
		btnSubtract.setFont(new Font("���� ���", Font.PLAIN, 17));
		btnSubtract.setBackground(Color.WHITE);
		btnSubtract.setBounds(648, 13, 111, 33);
		jpSum.add(btnSubtract);
		
		//--------------------------------------------------------------------------
		// ���� ��ư
		btnPay.setFont(new Font("���� ���", Font.PLAIN, 17));
		btnPay.setBackground(Color.WHITE);
		btnPay.setBounds(248, 598, 111, 33);
		contentPane.add(btnPay);
		// ��� ��ư
		btnCancel.setToolTipText("");
		btnCancel.setFont(new Font("���� ���", Font.PLAIN, 17));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(425, 598, 111, 33);
		btnCancel.addActionListener(new Event_btnCancelinSf(this)); // �̺�Ʈ
		contentPane.add(btnCancel);
	}
	
}
