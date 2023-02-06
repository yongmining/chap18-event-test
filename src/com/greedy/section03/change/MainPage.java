package com.greedy.section03.change;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainPage extends JPanel {
	
	private MainFrame mf;
	private JPanel mainPage;
	
	public MainPage(MainFrame mf) {
		this.mf = mf;
		this.mainPage = this;
		this.setSize(300, 200);
		
		this.setBackground(Color.blue);;
		
		this.addMouseListener(new MyMouseAdapter());
		
		mf.add(this);
	
	}
	private class MyMouseAdapter extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			PanelChanger.changePanel(mf, mainPage, new SubPage());
			
		}
	}
}