package com.day20;

// 1:다 채팅서버

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
			System.out.println("서버 시작!!...");

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

				msg = ip + "]가 입장했습니다. ";
				
				//IP 뿌림
				for (Socket s : clients) {

					if (s == sc) {
						continue;
					}

					PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
					pw.println(msg);

				}
				System.out.println(msg);
				
				//대화출력
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
				msg = ip + "]가 퇴장했습니다. ";
				
				try {
					
					for (Socket s : clients) {
						
						if (s == sc) {
							continue;
						}
						
						PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
						pw.println(msg);
						
					}
					System.out.println(msg);
					sc = null; //초기화 해야 두번째 연결이 된다.
					
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
