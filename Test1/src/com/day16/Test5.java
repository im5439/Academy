package com.day16;

// Daemon 스레드
// 다른 스레드에 도움을 주는 스레드로 다른 스레드가 종료되면
// 데몬스레드가 종료되지 않아도 프로세스가 종료 된다.

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
		
		t1.setDaemon(true);   // main 메소드 끝나면 같이 종료
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
			
			t1.join();    // t1 Thread가 끝날때 까지 main 대기
			t2.join();
			t3.join();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		System.out.println("main 종료...");
	}

}
