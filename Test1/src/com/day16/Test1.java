package com.day16;

//Thread 클래스

class MyThread1 extends Thread {

	private int num;
	private String name;

	public MyThread1(int num, String name) {
		this.num = num;
		this.name = name;
	}

	@Override
	public void run() { //자바의 VM이 호출
		
		int i = 0;
		
		while (i < num) {
			
			System.out.println(this.getName() + " : " + name + i);
			i++;
			
			try { // try-catch문 반드시 있어야함
				
				sleep(100);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
	}

}

public class Test1 {

	public static void main(String[] args) {

		MyThread1 t1 = new MyThread1(100, "첫번째");
		MyThread1 t2 = new MyThread1(200, "두번째");
		
		//스레드 실행
		t1.start();
		t2.start();
		
		System.out.println("main 종료됨...");
		
	}

}
