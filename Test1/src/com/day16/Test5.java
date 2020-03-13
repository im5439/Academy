package com.day16;

// Daemon ������
// �ٸ� �����忡 ������ �ִ� ������� �ٸ� �����尡 ����Ǹ�
// ���󽺷��尡 ������� �ʾƵ� ���μ����� ���� �ȴ�.

class Mythread5 implements Runnable {
	
	@Override
	public void run() {
	
		for(int i = 1; i <= 20; i++) {
			
			System.out.println(i);
			
			try {
				
				Thread.sleep(1000);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	
	}
	
}

public class Test5 {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Mythread5());
		Thread t2 = new Thread(new Mythread5());
		Thread t3 = new Thread(new Mythread5());
		
		t1.setDaemon(true);   // main �޼ҵ� ������ ���� ����
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			
			Thread.sleep(5000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			
			t1.join();    // t1 Thread�� ������ ���� main ���
			t2.join();
			t3.join();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		System.out.println("main ����...");
	}

}
