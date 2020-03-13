package com.day16;

class MyThread2 implements Runnable {

	private int num;
	private String name;

	public MyThread2(int num, String name) {
		this.num = num;
		this.name = name;
	}

	@Override
	public void run() {

		int i = 0;

		while (i < num) {

			System.out.println(name + " : " + i);
			i++;
			
			try {
				
				Thread.sleep(100);  // 인터페이스 구현했을때는 Thread.sleep()
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
		}

	}

}

public class Test2 {

	public static void main(String[] args) {

		System.out.println("main 시작");
		
		Thread t1 = new Thread(new MyThread2(100, "첫번째"));
		Thread t2 = new Thread(new MyThread2(200, "두번째"));
		
		t1.start();
		t2.start();
		
		System.out.println("main 종료");
		
	}

}
