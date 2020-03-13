package com.day14;

import java.util.Scanner;

// Exception : 예외처리

public class Test6 {

	public static void main(String[] args) {
		
		int num1, num2, result;
		String oper;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("두개의 수? "); // 30 20
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			System.out.print("연산자? "); // +
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

			System.out.println("0으로 나눌수 없다.");
			System.out.println(e.toString());
			e.printStackTrace();
			
		} catch (NumberFormatException e) {
			
			System.out.println("넌 그게 정수로 보이냐?");
			
		} catch (Exception e) {
			
			System.out.println("나도 몰라!!");
			
		} finally {
			
			System.out.println("여기는 무조건 실행!!");
		
		}
		
	}
	
}
