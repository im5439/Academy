package com.day16;

import java.util.Calendar;

class TClock implements Runnable {

	
	@Override
	public void run() {
	
		while(true) {
			
			System.out.printf("%1$tF %1$tT\n", Calendar.getInstance());
			
			try {
				
				Thread.sleep(1000);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	
	}
	
	
	
}

public class Test3 {

	public static void main(String[] args) {

		// ���� �ý����� ��¥�� �ð��� 1�ʿ� �ѹ��� ���
		
		Thread t1 = new Thread(new TClock());
		
		t1.start();
		
		
		
	}

}
