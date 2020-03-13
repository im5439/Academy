package com.day9;

// 비정형 인수 - 기억만 하셈, 중요x
// 배열의 크기를 지정하지 않음 , data의 개수로 크기를 지정
// 크기가 정해지지 않은 배열

public class Test6 {
	
	int sum(int...args) { // ...은 반드시 3개
		
		int s = 0;
		
		for(int i = 0; i < args.length; i++) {
			s += args[i];
		}
		
		return s;
		
	}

	public static void main(String[] args) {

		Test6 ob = new Test6();
		
		int result;
		
		result = ob.sum(2,4,6,8);
		System.out.println(result);
		
		result = ob.sum(1,3,5,7,9,13,15,17,19);
		System.out.println(result);
		
	}

}
