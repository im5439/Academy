package com.day12;

// 4.내부클래스(Annonymous, 익명의,무명의 class)    - 반드시 기억

public class Test9 {

	public Object getTitle() {
		
		return new Object() {   // new Object(){} 무명의 클래스
			
			@Override
			public String toString() {
				return "익명의 클래스";  // 호출할 필요가 없음. getTitle()을 호출하면 자동 실행 
			}
			
		};
		
	}
	
	public static void main(String[] args) {

		Test9 ob = new Test9();
		
		System.out.println(ob.getTitle());
		
	}

}
