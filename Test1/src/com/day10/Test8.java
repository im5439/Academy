package com.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test8 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("����[3+5]? "); // 321+56
		String str = br.readLine();

		str = str.replaceAll("\\s", ""); // ����(\\s)�� ã�Ƽ� ""(null)�� �����.

//		String[] oper = { "+", "-", "*", "/" };
//		String[] oper = new String[4];
//		for (String op : oper) {
//			
//		}

		for (String op : new String[] { "+", "-", "*", "/" }) {  // line 18,19�� ��ģ��

			// 321+56
			// 012345
			int pos = str.indexOf(op); // 3

			if (pos > -1) {

				int num1 = Integer.parseInt(str.substring(0, pos));  // pos 3-1 , 0~2����
				int num2 = Integer.parseInt(str.substring(pos + 1)); // 4~������

				int result = 0;

				char operator = str.charAt(pos);

				switch (operator) {

				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					result = num1 / num2;
					break;

				}

//				System.out.printf("%d %c %d = %d", num1, operator, num2, result);
				
				String s = String.format("%d %c %d = %d", num1, operator, num2, result);
				
				System.out.println(s);
				
				//return s;  - ���ϴ� ���� ����� �� ����.
				
			}

		}

	}

}
