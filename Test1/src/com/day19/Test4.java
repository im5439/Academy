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
	
	private Button btn; // ��ư
	private TextArea ta; // �����ִ°�
	private TextField tf; // ���ڸ� ���°�

	public Test4() {

		tf = new TextField();
		ta = new TextArea();
		btn = new Button("�߰�");
		
		add(tf, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		setTitle("������");
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
		
		if(ob instanceof Button || ob instanceof TextField) { // ��ư�Է� || �ؽ�Ʈ�ʵ忡�� �Է�
			
			String str = tf.getText();
			
			if(!str.equals(null)) {
				ta.append(str + "\r\n");
			}
			
			tf.setText("");
			tf.requestFocus(); // �� ���۳�Ʈ�� �Է������� �����, �� ���۳�Ʈ�� �ֻ����� Ŭ������ �����쿡 ��Ŀ���� �����ϴ� ���� �䱸�մϴ�.
			
		}
		
	}
}
