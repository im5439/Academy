package com.quiz3;

import java.util.Random;
import java.util.Scanner;

public class Q3 {

//	3. 1~3������ ������ �߻����� ����,����,�� ���� ���α׷� �ۼ�
//	  1:����, 2:����, 3:��
//
//	��)
//	1:����, 2:����, 3:�� ?1
//	��ǻ�� :�� ��� :����
//	����� �̰���ϴ�
//
//	1:����, 2:����, 3:�� ?1
//	��ǻ�� :���� ��� :����
//	��ǻ�Ͱ� �̰���ϴ�

	public static void main(String[] args) {     // ��ȯ��(return) : �ڷ���,String  / void ��ȯ�� ����.  ||  public : ���� ������(������)  private : ���� ������(�ƹ���x) 
                          // �Ű�����
		Scanner sc = new Scanner(System.in);

		Random rd = new Random();

		int com ;
		int hum, i;
		String[] scom = { "����", "����", "��" };

		i = 0;

		com = rd.nextInt(3);

		scom[com].substring(0, 1);
//		System.out.println(scom[com]);

		System.out.print("1:����, 2:����, 3:�� ?(�����Է�) ");
		hum = sc.nextInt();

		scom[hum - 1].substring(0, 1);
//		System.out.println(scom[hum - 1]);

		System.out.println("��ǻ�� : " + scom[com] + "  ��� : " + scom[hum - 1]);

		if ((scom[com] == "����" && scom[hum - 1] == "����") || (scom[com] == "����" && scom[hum - 1] == "����")
				|| (scom[com] == "��" && scom[hum - 1] == "��")) {
			System.out.println("�����ϴ�.");
		} else if ((scom[com] == "����" && scom[hum - 1] == "����") || (scom[com] == "����" && scom[hum - 1] == "��")
				|| (scom[com] == "��" && scom[hum - 1] == "����")) {
			System.out.println("����� �̰���ϴ�.");
		} else if ((scom[com] == "����" && scom[hum - 1] == "��") || (scom[com] == "����" && scom[hum - 1] == "����")
				|| (scom[com] == "��" && scom[hum - 1] == "����")) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}

		sc.close();
	}
}
