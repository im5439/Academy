package com.day19;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test3 extends Frame {

	private static final long serialVersionUID = 1L;

	public Test3() {

		setTitle("������");
		setSize(400, 300);

		addWindowListener(new MyWindowAdaptor());

		setVisible(true);

	}

	class MyWindowAdaptor extends WindowAdapter { // WindowAdapter �� WindowListener�� �ٸ��� ��� �������̵� �޼ҵ带 ��� ���� ����.

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		
		
		
		
	}

	public static void main(String[] args) {
		new Test3();
	}

}
