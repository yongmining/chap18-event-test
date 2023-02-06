package com.greedy.section02.uses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class A_AnonymousClassTest {

	public static void main(String[] args) {
	
		JFrame mf = new JFrame("익명클래스 예제");
		mf.setSize(300, 200);
		
		
		JPanel panel = new JPanel();
		JButton button = new JButton("버튼을 눌러보세요");
		JLabel label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					
				label.setText("드디어 버튼이 눌러졌습니다.");
			}
		});
		
		JButton button2 = new JButton("새로운 버튼");
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				label.setText("드디어 버튼이 눌러졌습니다.");
				
			}
		});
		
		panel.add(button);
		panel.add(label);
		panel.add(button2);
		
		mf.add(panel);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
