package com.day19;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test4 extends Frame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private Button btn; // 버튼
	private TextArea ta; // 보여주는곳
	private TextField tf; // 글자를 쓰는곳

	public Test4() {

		tf = new TextField();
		ta = new TextArea();
		btn = new Button("추가");
		
		add(tf, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		setTitle("윈도우");
		setSize(400, 300);
		
		btn.addActionListener(this);
		tf.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Test4();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object ob = e.getSource();
		
		if(ob instanceof Button || ob instanceof TextField) { // 버튼입력 || 텍스트필드에서 입력
			
			String str = tf.getText();
			
			if(!str.equals(null)) {
				ta.append(str + "\r\n");
			}
			
			tf.setText("");
			tf.requestFocus(); // 이 컴퍼넌트가 입력초점을 취득해, 이 컴퍼넌트의 최상정도 클래스의 윈도우에 포커스를 설정하는 것을 요구합니다.
			
		}
		
	}
}
