package com.day19;

import java.awt.Color;
import java.awt.Frame;

// AWT(Abstract Window ToolKit) : 
// �̺�Ʈ ���� ���α׷��� �����ϱ� ����

public class Test1 extends Frame{ // ��� ������ Frame�� �ִ�.

	private static final long serialVersionUID = 1L;

	public Test1() { // ��� �ڵ��� �����ڿ��� �Ѵ�.
		
		setTitle("�ڹ� ������");
		setSize(400, 300);
		setBackground(new Color(255, 255, 0));
		
		setVisible(true); //�⺻false  â�� �������� true & false
		
	}
	
	public static void main(String[] args) {
		new Test1();
	}

}
