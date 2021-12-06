package com.java.frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.java.event.Event_btnCancelinRf;

import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Registrationframe extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtRgName;
	private JTextField txtRgPrice;
	private JTextField txtRgCategory;
	private JTextField txtRgExpiration;
	
	public Registrationframe() {

		JPanel jpRegistration = new JPanel();
		JLabel lbRgName = new JLabel("ÀÌ¸§");
		JLabel lbRgPrice = new JLabel("±Ý¾×");
		JLabel lbRgCategory = new JLabel("Ä«Å×°í¸®");
		JLabel lbRgExpiration = new JLabel("À¯Åë±âÇÑ");
		
		JButton btnRegister = new JButton("µî·Ï");
		JButton btnCancel = new JButton("Ãë¼Ò");
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 293);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		jpRegistration.setBackground(SystemColor.inactiveCaption);
		jpRegistration.setBounds(12, 10, 550, 187);
		contentPane.add(jpRegistration);
		jpRegistration.setLayout(null);
		
		lbRgName.setHorizontalAlignment(SwingConstants.CENTER);
		lbRgName.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lbRgName.setBounds(12, 20, 80, 25);
		jpRegistration.add(lbRgName);
		
		lbRgPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lbRgPrice.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lbRgPrice.setBounds(12, 60, 80, 25);
		jpRegistration.add(lbRgPrice);
		
		lbRgCategory.setHorizontalAlignment(SwingConstants.CENTER);
		lbRgCategory.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lbRgCategory.setBounds(12, 100, 80, 25);
		jpRegistration.add(lbRgCategory);
		
		lbRgExpiration.setHorizontalAlignment(SwingConstants.CENTER);
		lbRgExpiration.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lbRgExpiration.setBounds(12, 140, 80, 25);
		jpRegistration.add(lbRgExpiration);
		
		txtRgName = new JTextField();
		txtRgName.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		txtRgName.setBounds(104, 18, 430, 30);
		jpRegistration.add(txtRgName);
		txtRgName.setColumns(10);
		
		txtRgPrice = new JTextField();
		txtRgPrice.setText("´ÜÀ§¸¦ »©°í ÀÔ·ÂÇÏ¿© ÁÖ¼¼¿ä. ¿¹) 2000");
		txtRgPrice.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		txtRgPrice.setColumns(10);
		txtRgPrice.setBounds(104, 60, 430, 30);
		jpRegistration.add(txtRgPrice);
		
		txtRgCategory = new JTextField();
		txtRgCategory.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		txtRgCategory.setColumns(10);
		txtRgCategory.setBounds(104, 100, 430, 30);
		jpRegistration.add(txtRgCategory);
		
		txtRgExpiration = new JTextField();
		txtRgExpiration.setText("¿¹) 2021.01.01");
		txtRgExpiration.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		txtRgExpiration.setColumns(10);
		txtRgExpiration.setBounds(104, 140, 430, 30);
		jpRegistration.add(txtRgExpiration);
		
		btnRegister.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		btnRegister.setBounds(130, 207, 111, 33);
		contentPane.add(btnRegister);
		
		btnCancel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		btnCancel.setBounds(333, 207, 111, 33);
		btnCancel.addActionListener(new Event_btnCancelinRf(this));
		contentPane.add(btnCancel);
	}
}
