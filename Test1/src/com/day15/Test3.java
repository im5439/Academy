package com.day15;

import java.util.Scanner;

class MyExecp {

	public void inputFormat(String str) throws Exception {

		// 5~10�� �̳��� �����ڸ� �Է�
		if (str.length() < 5 || str.length() > 10) {
			throw new Exception("���ڿ��� ���̴� 5~10�� �Դϴ�.");
		}

		// ������(��ҹ���)�� �����մϴ�. ascii 65~90, 97~122 / 65���� �۰�, 90~97, 122���� ũ�� �ȵ�
		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			if ((temp < 65 || temp > 90) && (temp < 97 || temp > 122)) {
				throw new Exception("�����ڸ� �����մϴ�.");
			}
//			if(temp < 65|| temp > 122) {
//				throw new Exception("�����ڸ� �����մϴ�.");
//			} else if(temp < 90 && temp > 97) {
//				throw new Exception("�����ڸ� �����մϴ�.");
//			}

		}

	}

}

public class Test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str;

		MyExecp auth = new MyExecp();

		try {

			System.out.print("���ڿ�? ");
			str = sc.next();

			auth.inputFormat(str);

			System.out.println(str);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
