package com.day10;

public class Test6 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();

		sb.append("����");
		sb.append("�λ�");
		sb.append("�뱸");

		System.out.println(sb); // ������ Ÿ�� StringBuffer

		// String���� ��ȯ�ؼ� ���
		String str = sb.toString();

		System.out.println(str); // ������ Ÿ�� String

		// Integer
		int a = 24;
		System.out.println(a); // 24
		System.out.println(Integer.toString(a) + 1); // ����
		System.out.println(Integer.toString(a,2)); // 2����
		System.out.println(Integer.toString(a,16)); // 16����

	}

}
