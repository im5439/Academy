package com.test1;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

//		6. �̸��� 3������ ������ �Է� �޾� �������ǿ� ���� ���
//		-��� ������ ������ 40�� �̻��̰� ����� 60�� �̻��̸� �հ�
//		-�Ѱ����̶� 40�� �̸��̰� ����� 60�� �̻��̸� ����
//		-����� 60�� �̸��̸� ���հ�
//
//		�̸� ? ȫ�浿
//		������ ���� ? 60 70 80
//		�̸� : ȫ�浿
//		���� : 210, ��� : 70, ���� :�հ�

		Scanner sc = new Scanner(System.in);

		int score1, score2, score3;
		String result, name;

		System.out.print("�̸��� �Է��ϼ���. ");
		name = sc.next();

		System.out.print("3���� ������ �Է��ϼ���.(ex 60 70 80) ");
		score1 = sc.nextInt();
		score2 = sc.nextInt();
		score3 = sc.nextInt();

		int tscore = score1 + score2 + score3;
		int avr = tscore / 3;

		if (avr >= 60 && score1 > 40 && score2 > 40 && score3 > 40) {
			result = "�հ�";
		} else
			result = "���հ�";

		System.out.println("�̸� : " + name + "\n���� : " + tscore + ", ��� : " + avr + ", ���� : " + result);
		
		sc.close();

	}

}
