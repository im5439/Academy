package com.quiz1;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

//		�̸��� 3������ ������ �Է� �޾� �������ǿ� ���� ���
//		-��� ������ ������ 40�� �̻��̰� ����� 60�� �̻��̸� �հ�
//		-�Ѱ����̶� 40�� �̸��̰� ����� 60�� �̻��̸� ����
//		-����� 60�� �̸��̸� ���հ�
//
//	    �̸� ? ȫ�浿
//	    ������ ���� ? 60 70 80
//	    �̸� : ȫ�浿
//		���� : 210, ��� : 70, ���� :�հ�

		Scanner sc = new Scanner(System.in);

		int score1, score2, score3, aver, tscore;
		String name, jud;

		System.out.print("�̸��� �Է��ϼ���. ");
		name = sc.next();

		System.out.print("3���� ������ �Է��ϼ���.(ex 60 70 80) ");
		score1 = sc.nextInt();
		score2 = sc.nextInt();
		score3 = sc.nextInt();

		tscore = score1 + score2 + score3;
		aver = (tscore) / 3;

		if (aver >= 60 && score1 > 40 && score2 > 40 && score3 > 40) {
			jud = "�հ�";
		} else {
			jud = "���հ�";
		}

		System.out.println("�̸� : " + name + "\n" + "���� : " + tscore + ", " + "��� : " + aver + ", " + "���� : " + jud);

		sc.close();
	}

}
