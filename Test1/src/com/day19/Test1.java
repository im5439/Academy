package com.day19;

import java.awt.Color;
import java.awt.Frame;

// AWT(Abstract Window ToolKit) : 
// 이벤트 단위 프로그램을 이해하기 위해

public class Test1 extends Frame{ // 모든 도구는 Frame에 있다.

	private static final long serialVersionUID = 1L;

	public Test1() { // 모든 코딩은 생성자에다 한다.
		
		setTitle("자바 윈도우");
		setSize(400, 300);
		setBackground(new Color(255, 255, 0));
		
		setVisible(true); //기본false  창을 볼지말지 true & false
		
	}
	
	public static void main(String[] args) {
		new Test1();
	}

}
