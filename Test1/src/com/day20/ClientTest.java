package com.day20;

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
import java.net.Socket;

@SuppressWarnings("serial")
public class ClientTest extends Frame implements ActionListener, Runnable {

	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	private Socket sc = null;
	private int port = 7777;
	private String host = "192.168.16.27"; // 127.0.0.1 -> IP에서 자기자신

	public ClientTest() {

		add(ta, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);

		tf.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setTitle("채팅 클라이언트");
		setSize(300, 400);
		setVisible(true);
		tf.requestFocus();

	}

	public static void main(String[] args) {
		new ClientTest().connect();
	}

	@Override
	public void run() {

		// 데이터를 받을때
		String str;

		try {

			if (sc == null) {
				return;
			}

			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			while ((str = br.readLine()) != null) {
				ta.append("\r\n" + str);
			}

		} catch (Exception e) {
			ta.append("\n\r 서버 연결 종료!!");
			sc = null;
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
			pw.println("클라이언트]" + str);

			ta.append("\r\n클라이언트] " + str);

			tf.setText("");
			tf.requestFocus();

		} catch (Exception e) {
			ta.append("\r\n 서버와 연결이 끊겼습니다.");
			sc = null;
		}

	}

	public void connect() {

		try {

			sc = new Socket(host, port);

			Thread th = new Thread(this);
			th.start();

		} catch (Exception e) {
			ta.append("서버가 죽어있다.");
		}

	}

}
