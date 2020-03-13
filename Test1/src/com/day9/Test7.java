package com.day9; // 계산기 ver.3

import java.io.IOException;
import java.util.Scanner;

class Calc {

	private int num1, num2;
	private char oper;

	public boolean input() throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.print("두개의 수? "); // 10 20
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.print("연산자? "); // +,-,*,/
		oper = (char) System.in.read();

		if (oper != '+' && oper != '-' && oper != '*' && oper != '/') {
			return false; // error
		}

		return true; // ok

	}

	public int result() {

		int r = 0;

		switch (oper) {
		case '+':
			r = num1 + num2;
			break;
		case '-':
			r = num1 - num2;
			break;
		case '*':
			r = num1 * num2;
			break;
		case '/':
			r = num1 / num2;
			break;
		}

		return r;

	}

	public void print(int r) {

		System.out.printf("%d %c %d = %d\n", num1, oper, num2, r);

	}

}

public class Test7 {

	public static void main(String[] args) throws IOException {

		Calc ob = new Calc();

		// true(o), false(x)
//		boolean b = ob.input();

		if (!ob.input()) {
			// false
			return; // stop
		}

		int r = ob.result();
		ob.print(r);
		// true

	}
}
