package com.day2;

class Test3 {
	public static void main(String[] args) {
		
		int r = 20;
		float a,l;

		a = r * r * 3.14f; // 10*10*3.14
//		a = (float)(r * r * 3.14); 강제 형변환
		l = r * 2 * 3.14f;

		System.out.printf("반지름 : %d, 넓이 : %f \n" ,r, a);
		System.out.printf("반지름 : %d, 넓이 : %.2f \n" ,r, a);  // %.2f : 소수점 2자리 까지
		System.out.println("반지름 : " + r + ", 둘레 : " + l);  // println은 소수점 자르기 안됨



	}
}
