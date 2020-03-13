package com.day16;

//Thread Ŭ����

class MyThread1 extends Thread {

	private int num;
	private String name;

	public MyThread1(int num, String name) {
		this.num = num;
		this.name = name;
	}

	@Override
	public void run() { //�ڹ��� VM�� ȣ��
		
		int i = 0;
		
		while (i < num) {
			
			System.out.println(this.getName() + " : " + name + i);
			i++;
			
			try { // try-catch�� �ݵ�� �־����
				
				sleep(100);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
	}

}

public class Test1 {

	public static void main(String[] args) {

		MyThread1 t1 = new MyThread1(100, "ù��°");
		MyThread1 t2 = new MyThread1(200, "�ι�°");
		
		//������ ����
		t1.start();
		t2.start();
		
		System.out.println("main �����...");
		
	}

}
