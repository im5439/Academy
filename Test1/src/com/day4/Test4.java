package com.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int su;
		int sum = 0;
		char ch;

		while (true) { // ���ѷ���

			do {
				System.out.print("�� �Է�? ");
				su = Integer.parseInt(br.readLine());
			} while (su < 1 || su > 5000);

			sum = 0;
			for (int i = 1; i <= su; i++) {
				sum += i;
			}

			System.out.println("1~" + su + "������ �� : " + sum);

			// ��� �������� ����
			System.out.print("����ҷ�?[Y/N] ");// Y,y,N,n,a,d�ƴ�
			ch = (char) System.in.read();

			if (ch != 'Y' && ch != 'y') { // ch != 'Y' && ch != 'y'   <= ���� ��� !=(not) �� �� &&(O), ||(X)

				System.out.println("����");
				break;
				// while, do-while, for, switch
			}
		
			System.in.skip(2); // ASCII�� - Enter(10,13)���� �ؾ� error �ȶ�.   => BufferedReader������

		}//end...while(true)
		
	}

}
