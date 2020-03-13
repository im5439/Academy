package com.day9;

// 되부름 함수 : 메소드 안에서 자기 함수를 호출 - 잘안나오지만 기술면접, 중요 x
// 소스는 간단해 보이지만 처리속도가 느리다.
// data를 stack에 저장했다가 출력

public class Test5 {

	public void print(int n) {

		if (n != 1) {
			print(n - 1); // 되부름 함수
		}

		System.out.printf("%4d", n);

	}

	public int sum(int n) {

		return n > 1 ? n + sum(n - 1) : n;

		// 10+sum(9)
		// 9+sum(8)
		// 8+sum(7)
		// ....

	}

	public int pow(int a, int b) {

		return b >= 1 ? a * pow(a, b - 1) : 1;

	}

	public static void main(String[] args) {

		Test5 ob = new Test5();

		ob.print(5);
		System.out.println("\n---------");

		int s = ob.sum(10);
		System.out.println(s);

		System.out.println("---------");

		System.out.println("pow(2,10) : "+ ob.pow(2, 10));
		
	}

}
