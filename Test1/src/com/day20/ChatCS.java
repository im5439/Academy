package com.day20;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

// UDP(�ٰŸ�) <--> TCP/IP
// D-Class : 224.0.0.0 ~239.255.255.255
// DatagramSocket : UDP�� �����ͱ׷� ��Ŷ�� �����ϰų� ����
// DatagramPacket : UDP�� �̿��Ͽ� ���۵ɼ� �ִ� ������
// MulticastSocket : �ټ��� Ŭ���̾�Ʈ���� �����ͱ׷� ��Ŷ�� ����


@SuppressWarnings("serial")
public class ChatCS extends Frame implements ActionListener, Runnable {
	
	private MulticastSocket ms = null;
	private InetAddress xGroup = null;
	
	private String host = "230.0.0.2";
	private int port = 7777;
	private String userName = "����";
	
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	
	public ChatCS() {
		
		ta.setEditable(false); // TextArea ��Ȱ��ȭ �۸�����
		add(ta, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);
		tf.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("�׷�ä��");
		setSize(400, 400);
		setVisible(true);
		
		tf.requestFocus();
	}
	
	public void setup() {
		
		try {
			
			xGroup = InetAddress.getByName(host); // 230.0.0.1
			ms = new MulticastSocket(port); // 7777
			
			ms.joinGroup(xGroup);
			
			Thread th = new Thread(this);
			th.start();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void disconnect() {
		
		try {
			
			ms.leaveGroup(xGroup);
			ms.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public static void main(String[] args) {
		new ChatCS().setup();
	}

	@Override
	public void run() {
		
		try {
			
			while (true) {
				
				byte[] buffer = new byte[512];
				
				//���� ���� ��Ŷ
				DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
				
				//���� ����
				ms.receive(dp);
				
				String str = new String(dp.getData()).trim();
				ta.append(str + "\r\n");
				
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
			disconnect();
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String str = tf.getText().trim();
		
		if (str.equals(""))
			return;
		
		byte[] buffer = (userName + "]" + str).getBytes();
		
		try {
			
			DatagramPacket dp = new DatagramPacket(buffer, buffer.length, xGroup, port);
			
			ms.send(dp);
			
			tf.setText("");
			tf.requestFocus();
			
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
	}

}
