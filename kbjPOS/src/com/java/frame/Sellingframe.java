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
		JButton btnSearch = new JButton("검색");
		
		JPanel jpAdd = new JPanel();
		JList listSearchResult = new JList();
		JButton btnAdd = new JButton("상품 추가");

		JPanel jpSum = new JPanel();
		JList listAdded = new JList();
		JCheckBox chckbxMDiscount = new JCheckBox("회원 할인");
		JButton btnApply = new JButton("적용");
		JButton btnSubtract = new JButton("선택 취소");
		
		JButton btnPay = new JButton("구매");
		JButton btnCancel = new JButton("취소");
		
		setTitle("상품 판매");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 700);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		// 검색 패널 ---------------------------------------------------------------------------------
		jpSearch.setBackground(SystemColor.inactiveCaption);
		jpSearch.setBounds(0, 0, 784, 80);
		contentPane.add(jpSearch);
		jpSearch.setLayout(null);
		// 검색 텍스트박스
		txtSearch = new JTextField();
		txtSearch.setBounds(31, 30, 591, 33);
		txtSearch.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		jpSearch.add(txtSearch);
		txtSearch.setColumns(45);
		// 검색 버튼
		btnSearch.setBackground(new Color(255, 255, 255));
		btnSearch.setBounds(650, 30, 111, 33);
		btnSearch.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		jpSearch.add(btnSearch);
		
		// 추가 패널 ---------------------------------------------------------------------------------
		jpAdd.setBackground(SystemColor.inactiveCaption);
		jpAdd.setBounds(0, 90, 784, 220);
		contentPane.add(jpAdd);
		jpAdd.setLayout(null);
		// 검색 결과 리스트
		listSearchResult.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
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
		// 추가 버튼
		btnAdd.setBackground(new Color(255, 255, 255));
		btnAdd.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		btnAdd.setBounds(649, 171, 111, 33);
		jpAdd.add(btnAdd);
		
		// 합계 패널 ---------------------------------------------------------------------------------
		jpSum.setBackground(SystemColor.inactiveCaption);
		jpSum.setBounds(0, 320, 784, 250);
		contentPane.add(jpSum);
		jpSum.setLayout(null);
		// 추가된 상품 리스트
		listAdded.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		listAdded.setBounds(31, 10, 591, 150);
		jpSum.add(listAdded);
		// 할인 텍스트박스 - 할인된 금액을 출력
		txtDiscount = new JTextField();
		txtDiscount.setText("할인 : ");
		txtDiscount.setBackground(SystemColor.text);
		txtDiscount.setEditable(false);
		txtDiscount.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		txtDiscount.setBounds(30, 160, 593, 30);
		jpSum.add(txtDiscount);
		txtDiscount.setColumns(10);
		// 합계 텍스트박스 - 합계 금액을 출력
		txtSum = new JTextField();
		txtSum.setBackground(SystemColor.text);
		txtSum.setText("합계 : ");
		txtSum.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		txtSum.setEditable(false);
		txtSum.setColumns(10);
		txtSum.setBounds(30, 189, 593, 30);
		jpSum.add(txtSum);
		// 회원 할인 체크박스
		chckbxMDiscount.setBackground(SystemColor.inactiveCaption);
		chckbxMDiscount.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
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
		// 멤버id 텍스트 - 전화번호를 입력
		txtMDiscount = new JTextField();
		txtMDiscount.setEnabled(false);
		txtMDiscount.setText("010");
		txtMDiscount.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		txtMDiscount.setBounds(648, 162, 116, 23);
		jpSum.add(txtMDiscount);
		txtMDiscount.setColumns(11);
		// 적용 버튼
		btnApply.setEnabled(false);
		btnApply.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnApply.setBackground(SystemColor.text);
		btnApply.setBounds(658, 195, 96, 23);
		jpSum.add(btnApply);
		// 선택 취소 버튼
		btnSubtract.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		btnSubtract.setBackground(Color.WHITE);
		btnSubtract.setBounds(648, 13, 111, 33);
		jpSum.add(btnSubtract);
		
		//--------------------------------------------------------------------------
		// 구매 버튼
		btnPay.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		btnPay.setBackground(Color.WHITE);
		btnPay.setBounds(248, 598, 111, 33);
		contentPane.add(btnPay);
		// 취소 버튼
		btnCancel.setToolTipText("");
		btnCancel.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(425, 598, 111, 33);
		btnCancel.addActionListener(new Event_btnCancelinSf(this)); // 이벤트
		contentPane.add(btnCancel);
	}
	
}
