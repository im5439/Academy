package com.quiz1;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

//		�ܰ� 15,800��¥�� ��ǰ�� ���� ���� �̻� ���Խ� ������ ���ݴϴ�.
//		�������� ������ �����ϴ�.
//		10�� �̻� -> 10%
//		20�� �̻� -> 15%
//		30�� �̻� -> 20%
//		�Ǹűݾ��� ����غ��ϴ�.
//		��) ���Լ��� 15���� ��� -> ���Լ���: 15��, �Ǹ��ѱݾ�: 213300��

		Scanner sc = new Scanner(System.in);

		int unp = 15800;
		int qan, mon, dc; // ���Լ���, �Ǹ��ѱݾ�, ���αݾ�

		System.out.print("��ǰ�� ������ �Է��ϼ���. ");
		qan = sc.nextInt();

		if (qan >= 10 && qan < 20) {
			mon = (int) (unp * qan * (0.9));
			dc = (int) (unp * qan * (0.1));
		} else if (qan >= 20 && qan < 30) {
			mon = (int) (unp * qan * (0.85));
			dc = (int) (unp * qan * (0.15));
		} else if (qan >= 30) {
			mon = (int) (unp * qan * (0.8));
			dc = (int) (unp * qan * (0.2));
		} else {
			mon = unp * qan;
			dc = 0;
		}

		System.out.println("���Լ���: " + qan + "��" + ", �Ǹ��ѱݾ�: " + mon + "��" + ", ���αݾ� : " + dc + "��");

		sc.close();

	}

}
