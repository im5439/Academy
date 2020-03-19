package com.day20;

// 1:�� ä�ü���

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerTest2 {

	private ArrayList<Socket> clients = new ArrayList<>();

	public void serverStart() {

		try {

			@SuppressWarnings("resource")
			ServerSocket ss = new ServerSocket(7777);
			System.out.println("���� ����!!...");

			while (true) {

				Socket sc = ss.accept();

				WorkTread wt = new WorkTread(sc);
				wt.start();

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	class WorkTread extends Thread {

		private Socket sc;

		public WorkTread(Socket sc) {
			this.sc = sc;
		}

		@Override
		public void run() {

			String ip = null;
			String msg = null;

			try {

				BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));

				ip = sc.getInetAddress().getHostAddress();

				clients.add(sc);

				msg = ip + "]�� �����߽��ϴ�. ";
				
				//IP �Ѹ�
				for (Socket s : clients) {

					if (s == sc) {
						continue;
					}

					PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
					pw.println(msg);

				}
				System.out.println(msg);
				
				//��ȭ���
				while ((msg = br.readLine()) != null) {
					
					for (Socket s : clients) {
						
						if (s == sc) {
							continue;
						}
						
						PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
						pw.println(msg);
						
					}
					System.out.println(msg);
					
					
				}

			} catch (Exception e) {
				msg = ip + "]�� �����߽��ϴ�. ";
				
				try {
					
					for (Socket s : clients) {
						
						if (s == sc) {
							continue;
						}
						
						PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
						pw.println(msg);
						
					}
					System.out.println(msg);
					sc = null; //�ʱ�ȭ �ؾ� �ι�° ������ �ȴ�.
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			}

		}

	}

	public static void main(String[] args) {
		new ServerTest2().serverStart();
	}

}
