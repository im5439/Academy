package com.day16;

//스레드의 생명주기

class MyThread6 extends Thread {

	@Override
	public void run() {

		try {

			System.out.println("스레드 시작...");

			System.out.println("우선순위: " + getPriority());
			System.out.println("스레드의 이름: " + getName());

			sleep(500); // 0.5초

			// 우선순위변경
			setPriority(2);
			System.out.println("변경된 우선순위: " + getPriority());

			System.out.println("스레드 종료...");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

public class Test6 {

	public static void main(String[] args) {

		Thread t1 = Thread.currentThread(); // main
		Thread t2 = new MyThread6();

		System.out.println("메인스레드 우선순위: " + t1.getPriority());
		System.out.println("메인스레드 이름: " + t1.getName());
		System.out.println("t2 스레드 시작전에: " + t2.isAlive()); // t2 살아있는지 (true,false)

		try {

			t2.start();

			System.out.println("t2 우선순위: " + t2.getPriority());
			
			t2.setPriority(1);

			Thread.sleep(100); // main
			System.out.println("0.1초 쉬고 t2살아있냐?: " + t2.isAlive());

			Thread.sleep(1000); // main
			System.out.println("1초 쉬고 t2살아있냐?: " + t2.isAlive());
			
			t2.join();

			System.out.println("t2살아있냐?: " + t2.isAlive());

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
