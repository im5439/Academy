package com.naver;

import java.util.Scanner;

//List Collection���� ȸ������ �����
//�޴� : ȸ������,ȸ����ü���, ���̵�˻�...
//���� : ȸ�����Խ� ���̵�� 8~15�� �̳�, ������ ���� ȥ��
//ID, PW1, PW2, NAME, GENDER, BIRTH(String), EMAIL, TEL(String)
//PW1 PW2 ���Ͽ� �ϳ��� ����
//�Է� ��� ���� ���̵�˻�
/*
 * public void input(); // ȸ������
	public void print(); // ȸ��������
	public void delete(); // ȸ��Ż��
	public void updata(); // ��������
	public void findId(); // ���̵�˻�
	public void findName(); // �̸��˻�
*/

public class NaverMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Naver ob = new NaverImpl();

		MyException auth = new MyException();

		String set;
		
		ob.readInfo();

		while (true) {
			try {
				System.out.println("----------------------------------------------------------------------------");
				System.out.println("                                 <���θ޴�>");
				System.out.println(" 1.ȸ������ 2.ȸ����� 3.ȸ��Ż�� 4.�������� 5.���̵�˻� 6.�̸��˻� 7.����");
				System.out.println();
				System.out.println("----------------------------------------------------------------------------");
				System.out.print("> ");
				set = sc.next();

				auth.inputformat(set);

				switch (set) {

				case "1":
					ob.input();
					break;
				case "2":
					ob.print();
					break;
				case "3":
					ob.delete();
					break;
				case "4":
					ob.updata();
					break;
				case "5":
					ob.findId();
					break;
				case "6":
					ob.findName();
					break;
				case "7":
					ob.saveInfo();
					System.out.println("<���α׷� ����>");
					System.exit(0);
				default:
					System.out.println("�߸��ԷµǾ����ϴ�.(1~7)");
					continue;
				}
			} catch (Exception e) {
				System.out.println("���ڸ� �Է°��� �մϴ�.1");
			}

		}
	}

}
