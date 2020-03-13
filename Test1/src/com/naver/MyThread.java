package com.naver;

public class MyThread implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.print(".");

			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

	}

}
