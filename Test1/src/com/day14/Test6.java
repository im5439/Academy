package com.day14;

import java.util.Scanner;

// Exception : ����ó��

public class Test6 {

	public static void main(String[] args) {
		
		int num1, num2, result;
		String oper;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("�ΰ��� ��? "); // 30 20
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			System.out.print("������? "); // +
			oper = sc.next();
			
			result = 0;
			
			if(oper.equals("+")) {
				result = num1 + num2;
			} else if(oper.equals("-")) {
				result = num1 - num2;
			} else if(oper.equals("*")) {
				result = num1 * num2;
			} else if(oper.equals("/")) {
				result = num1 / num2;
			}
			
			System.out.printf("%d %s %d = %d", num1, oper, num2, result);
			
		} catch (ArithmeticException e) {

			System.out.println("0���� ������ ����.");
			System.out.println(e.toString());
			e.printStackTrace();
			
		} catch (NumberFormatException e) {
			
			System.out.println("�� �װ� ������ ���̳�?");
			
		} catch (Exception e) {
			
			System.out.println("���� ����!!");
			
		} finally {
			
			System.out.println("����� ������ ����!!");
		
		}
		
	}
	
}
