package com.greedy.section02.uses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D_MethodTest extends JFrame implements ActionListener {
	
	private JLabel label;

	public D_MethodTest() {
		this.setSize(300, 200);
	
		JPanel panel = new JPanel();
		JButton button = new JButton();
		label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		
		panel.add(button);
		panel.add(label);
		
		button.addActionListener(this);
		
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		
		new D_MethodTest();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		label.setText("드디어 버튼이 눌러졌습니다.");
		
		
	}

}
