package com.day20;

// 1:1ä��

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

@SuppressWarnings("serial")
public class ServerTest extends Frame implements ActionListener, Runnable {

	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	private ServerSocket ss = null;
	private Socket sc = null;

	public ServerTest() {

		add(ta, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);

		tf.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setTitle("ä�� ����");
		setSize(300, 400);
		setVisible(true);
		tf.requestFocus();

	}

	public static void main(String[] args) {
		new ServerTest().serverStart();
	}

	@Override
	public void run() {

		// �����͸� ������
		String str;
		String ip;

		try {

			if (sc == null) {
				return;
			}

			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			ip = sc.getInetAddress().getHostAddress(); // Ŭ���̾�ƮIP

			ta.append("\r\n[" + ip + "] ����!!");

			while ((str = br.readLine()) != null) {
				ta.append("\r\n" + str);
			}

		} catch (Exception e) {
			ta.append("\n\r Ŭ���̾�Ʈ ���� ����!!");
			sc = null;
			ss = null; // ������ �ʱ�ȭ�� ���ƾ� �ι�° ���ῡ ����Ҽ� ����
		}

	}

	@Override
	public void actionPerformed(ActionEvent evt) {

		// �����͸� ������

		String str = tf.getText();

		if (str.trim().equals("")) {
			return;
		}

		if (sc == null) {
			return;
		}

		try {
			OutputStream os = sc.getOutputStream();
			PrintWriter pw = new PrintWriter(os, true);
			pw.println("����]" + str);
			
			ta.append("\r\n����] " + str);
			
			tf.setText("");
			tf.requestFocus();
			
		} catch (Exception e) {
			ta.append("\r\n Ŭ���̾�Ʈ�� ������ ������ϴ�.");
			sc = null;
		}

	}
	
	public void serverStart() {
		
		try {
			
			ss = new ServerSocket(7777);
			ta.setText("��������!!");
			
			sc = ss.accept(); //�� ���Ͽ� ���� ���� �䱸�� �����, �װ��� �޽��ϴ�.
			
			Thread th = new Thread(this);
			th.start();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	

}
