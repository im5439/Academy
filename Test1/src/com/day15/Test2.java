package com.day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		double num1, num2, result;
		
		OperationAutenticator auth = new OperationAutenticator();
		
		try {
			
			System.out.print("�ΰ��� ��[a,b] "); // 30, 20
			str = br.readLine();
			
			auth.inputFormat(str); // ����
			
			String[] temp = str.split(",");
			
			auth.number(temp[0]); // 30 - ����
			num1 = Double.parseDouble(temp[0]);
			
			auth.number(temp[1]); // 20 - ����
			num2 = Double.parseDouble(temp[1]);
			
			System.out.println("������? ");
			str = br.readLine();
			auth.operator(str.charAt(0)); // ����
			
			char ch = str.charAt(0);
			
			result = 0;
			
			if(ch == '+')
				result = num1 + num2;
			else if(ch == '-')
				result = num1 - num2;
			else if(ch == '*')
				result = num1 * num2;
			else if(ch == '/')
				result = num1 / num2;
			
			System.out.printf("%g %c %g = %g\n", num1, ch, num2, result);
			
		} catch (IOException e) {
			
			System.out.println(e.toString());
			
		} catch (AuthenticatorException e) {
			System.out.println(e.toString());
		}
		
	}

}
