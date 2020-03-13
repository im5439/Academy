package com.day16;

import java.util.Random;
import java.util.Scanner;

class MyThread implements Runnable {
	
	@Override
	public void run() {
		
		System.out.print("고민중");
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
		{"박서연","천홍철","이준성","경기민","성시연",
		"채종완","이혜경","차종민","김진수","전정민",
		"김현아","김원아","위준형","임현재","서혁호",
		"서예지","원도현","이상훈","최보경","신지예",
		"김세이","양서윤","김희연","최원식","정태양",
		"임충환","이건우"};
	

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		Thread t = new Thread(new MyThread());
		
		t.setDaemon(true);
		
		System.out.print("발표자 인원수? ");
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
		
		System.out.println("\n축하합니다!! 발표자 입니다.\n");
//		for (int i = 0; i < inwon; i++) {
//			for(int j = 0; j < i; j++) {
//				if(name[j] == name[i]) {
//					i--;
//					break;
//				}
//			}
//				String na = name[rd.nextInt(27)];
//			System.out.printf("%2d번 발표자 : %5s\n", i+1, na);
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
			System.out.printf("%2d번 발표자 : %5s\n", i+1, name[num[i]]);
		}
		
		
	}
		

}
