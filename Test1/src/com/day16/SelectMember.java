package com.day16;

import java.util.Random;
import java.util.Scanner;

class MyThread implements Runnable {
	
	@Override
	public void run() {
		
		System.out.print("�����");
		for(int i = 1; i < 20; i++ ) {
			System.out.print(".");
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println();
		
	}
	
}

public class SelectMember {

	private static String[] name = 
		{"�ڼ���","õȫö","���ؼ�","����","���ÿ�",
		"ä����","������","������","������","������",
		"������","�����","������","������","����ȣ",
		"������","������","�̻���","�ֺ���","������",
		"�輼��","�缭��","����","�ֿ���","���¾�",
		"����ȯ","�̰ǿ�"};
	

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		Thread t = new Thread(new MyThread());
		
		t.setDaemon(true);
		
		System.out.print("��ǥ�� �ο���? ");
		int inwon = sc.nextInt();
		
//		t.start();
//		
//		try {
//			
//			t.join();
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		System.out.println("\n�����մϴ�!! ��ǥ�� �Դϴ�.\n");
//		for (int i = 0; i < inwon; i++) {
//			for(int j = 0; j < i; j++) {
//				if(name[j] == name[i]) {
//					i--;
//					break;
//				}
//			}
//				String na = name[rd.nextInt(27)];
//			System.out.printf("%2d�� ��ǥ�� : %5s\n", i+1, na);
//		}
		
		int[] num = new int[inwon] ;
		
		int n = 0;
		while (n < inwon) {
			num[n] = rd.nextInt(27);
			
			for (int i = 0; i < n; i++) {
				if (num[i] == num[n]) {
					n--;
					break;
				}
			}
			
			n++;
		}
		
		for(int i =0; i < num.length; i++) {
			System.out.printf("%2d�� ��ǥ�� : %5s\n", i+1, name[num[i]]);
		}
		
		
	}
		

}
