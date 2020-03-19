package com.day20;

// 1:1채팅

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

		setTitle("채팅 서버");
		setSize(300, 400);
		setVisible(true);
		tf.requestFocus();

	}

	public static void main(String[] args) {
		new ServerTest().serverStart();
	}

	@Override
	public void run() {

		// 데이터를 받을때
		String str;
		String ip;

		try {

			if (sc == null) {
				return;
			}

			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			ip = sc.getInetAddress().getHostAddress(); // 클라이언트IP

			ta.append("\r\n[" + ip + "] 접속!!");

			while ((str = br.readLine()) != null) {
				ta.append("\r\n" + str);
			}

		} catch (Exception e) {
			ta.append("\n\r 클라이언트 연결 종료!!");
			sc = null;
			ss = null; // 소켓을 초기화해 놓아야 두번째 연결에 사용할수 있음
		}

	}

	@Override
	public void actionPerformed(ActionEvent evt) {

		// 데이터를 보낼때

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
			pw.println("서버]" + str);
			
			ta.append("\r\n서버] " + str);
			
			tf.setText("");
			tf.requestFocus();
			
		} catch (Exception e) {
			ta.append("\r\n 클라이언트와 연결이 끊겼습니다.");
			sc = null;
		}

	}
	
	public void serverStart() {
		
		try {
			
			ss = new ServerSocket(7777);
			ta.setText("서버시작!!");
			
			sc = ss.accept(); //이 소켓에 대한 접속 요구를 대기해, 그것을 받습니다.
			
			Thread th = new Thread(this);
			th.start();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	

}
