package com.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {

	public static void main(String[] args) throws IOException {

//		5.�ܰ� 15,800��¥�� ��ǰ�� ���� ���� �̻� ���Խ� ������ ���ݴϴ�.
//		�������� ������ �����ϴ�.
//		10�� �̻� -> 10%
//		20�� �̻� -> 15%
//		30�� �̻� -> 20%
//		�Ǹűݾ��� ����غ��ϴ�.
//		��) ���Լ��� 15���� ��� -> ���Լ���: 15��, �Ǹ��ѱݾ�: 213300��, ���αݾ�

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = 0; // ���Լ���
		int dcm = 0; // ���αݾ�
		int dc = 0; // ������
		int stm, dcstm; // �Ǹ��ѱݾ�, ������ ������ �� �� �ݾ�

		System.out.print("������ �Է��ϼ���. ");
		a = Integer.parseInt(br.readLine());

		stm = 15800 * a;

		if (a >= 10 && a < 20) {
			dc = (int) 0.9;
		} else if (a >= 20 && a < 30) {
			dc = (int) 0.85;
		} else if (a >= 30) {
			dc = (int) 0.8;
		} else
			dc = 1;

		dcstm = stm * dc;
		dcm = stm - dcstm;

		System.out.println("���Լ��� : " + a + ", �Ǹ��ѱݾ� : " + stm + ", ���αݾ� : " + dcm + ", ������ ������ �� �� �ݾ� : " + dcstm);

	}

}
