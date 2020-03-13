package com.day10;

//StringBuffer : ����ȭ�� ����(ó���ӵ� : �ʴ�)
//StirngBuilder : ����ȭ ���� x(ó���ӵ� : ������)

public class Test5 {

	public void stringTime() {

		System.out.println("StringTime...");

//		long start = System.currentTimeMillis();
		long start = System.nanoTime();

		String str = "A";

		for (int i = 1; i <= 50000; i++) {
			str += "A";
		}

		long end = System.nanoTime(); // 10^-9

		System.out.println("���� �ð�: " + (end - start));

	}

	public void stringBufferTime() {

		System.out.println("StringBufferTime...");

//		long start = System.currentTimeMillis();
		long start = System.nanoTime();
		
		StringBuffer str = new StringBuffer("A");


		for (int i = 1; i <= 50000; i++) {
			str.append("A");
		}

		long end = System.nanoTime(); // 10^-9

		System.out.println("���� �ð�: " + (end - start));

	}

	public void stringBuilderTime() {

		System.out.println("stringBuilderTime...");

//		long start = System.currentTimeMillis();
		long start = System.nanoTime();
		
		StringBuilder str = new StringBuilder("A");


		for (int i = 1; i <= 50000; i++) {
			str.append("A");
		}

		long end = System.nanoTime(); // 10^-9

		System.out.println("���� �ð�: " + (end - start));

	}

	
	public static void main(String[] args) {

		Test5 ob = new Test5();
		
		ob.stringTime();
		ob.stringBufferTime();
		ob.stringBuilderTime();
	}

}
