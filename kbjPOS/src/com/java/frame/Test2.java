package com.java.frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JList;
import java.awt.Color;
import java.awt.SystemColor;

public class Test2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test2 frame = new Test2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Test2() {

		JPanel panel = new JPanel();
		JList list = new JList();

		JButton btnOk = new JButton("확인");
		
		setTitle("판매 내역 조회");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 700);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(0, 99, 784, 475);
		contentPane.add(panel);
		panel.setLayout(null);
		
		list.setBounds(31, 26, 722, 278);
		panel.add(list);
		
		//-------------------------------------------------------------------------
		btnOk.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		btnOk.setBackground(Color.WHITE);
		btnOk.setBounds(337, 598, 111, 33);
		contentPane.add(btnOk);
		
	}
}
