package com.quiz3;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Q2 {

//	2. 1~10������ ������ �߻����� �߻���Ų ������ 3���ȿ� �˾� ���ߴ� ����
//	   (3���ȿ� �˾Ƹ����� ���ϸ� �߻��� ������ ���)
//
//	��)
//	�����Է�?[1��°��ȸ] : 3
//	Ʋ�Ⱦ��!!
//	�����Է�?[2��°��ȸ] : 5
//	Ʋ�Ⱦ��!!
//	�����Է�?[3��°��ȸ] : 7
//	Ʋ�Ⱦ��!!
//
//	������ 2�Դϴ�
//
//	����ҷ�?[Y/N] : 
//	------------------------------
//	�����Է�?[1��°��ȸ] : 7
//	Ʋ�Ⱦ��!!
//	�����Է�?[2��°��ȸ] : 4
//	Ʋ�Ⱦ��!!
//	�����Է�?[3��°��ȸ] : 9
//	�¾Ҿ��!!
//
//	������ 9�Դϴ�
//
//	����ҷ�?[Y/N] : 

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		Random rd = new Random();

		int num;

		int i, n;
		char yn = 0;

		n = rd.nextInt(10) + 1;

		System.out.println("1~10������ ������ �߻����� �߻���Ų ������ 3���ȿ� �˾� ���ߴ� ����");
		i = 0;
		while (true) {
			System.out.print("�����Է�?[" + (i + 1) + "��°��ȸ] : ");
			num = sc.nextInt();
			if (num != n) {
				System.out.println("Ʋ�Ⱦ��!!");
				i++;
			} else if (num == n) {
				System.out.println("�¾Ҿ��!!");
				System.out.println("\n������" + n + "�Դϴ�.");
				System.out.print("\n����ҷ�?[Y/N] : ");
				yn = (char) System.in.read();
				n = rd.nextInt(10) + 1;
				i = 0;
				if (yn != 'Y' && yn != 'y') {
					System.out.println("����");
					break;
				} else {
					System.out.println();
				}
			}

			if ((i + 1) > 3) {
				System.out.println("\n������" + n + "�Դϴ�.");
				System.out.print("\n����ҷ�?[Y/N] : ");
				yn = (char) System.in.read();
				n = rd.nextInt(10) + 1;
				i = 0;
				if (yn != 'Y' && yn != 'y') {
					System.out.println("����");
					break;
				} else {
					System.out.println();
				}
			}

		}
		sc.close();
	}

}
