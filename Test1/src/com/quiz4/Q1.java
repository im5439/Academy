package com.quiz4;

import java.io.IOException;

public class Q1 {

//	[����1]
//			System.in.read()�� ����ؼ� ���ڸ� �Է¹ް�
//			�Է¹��� �������� �հ踦 ���Ͻÿ�(��Ʈ : 48)
//
//			����
//			1.BufferedReader X
//			2.Scanner X
//
//			���
//			���Է�? 10
//			1-10������ ��: 55

	public static void main(String[] args) throws IOException {

		int n = 0, s = 0;
		int data;
		System.out.print("��� : ");
		while ((data = System.in.read()) != 13) { // 13�� Enter
			n = n * 10 + data - 48; // ����0 -> ASCII48
		}

		for (int i = 1; i <= n; i++) {
			s += i;
		}
		System.out.print("���  : " + s);

	}

}
