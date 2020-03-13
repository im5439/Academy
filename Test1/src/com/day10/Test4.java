package com.day10;

// String - class
// 사용하는 빈도는 많고 저장하는 데이터는 크다.
// 불변의 법칙


public class Test4 {

	public static void main(String[] args) {
		
	String ob1 = "Seoul";
	String ob2 = "Seoul";
	String ob3 = new String("Seoul");
	
	System.out.println("ob1==ob2: " + (ob1==ob2)); // true
	System.out.println("ob1==ob3: " + (ob1==ob3)); // false
	System.out.println("ob1.equals(ob3): " + ob1.equals(ob3)); // true
	//문자는 equals로 비교 해야한다. object의 equals를 오버라이딩 한것.
	
	ob2 = "korea"; // 한번 저장한 "seoul" 삭제안되고 "korea"를 새로 생성해 주소를 바꿈
	System.out.println("ob1==ob2: " + (ob1==ob2)); // false
	
	ob2 = "japan";
	System.out.println("ob1==ob2: " + (ob1==ob2)); // false

	ob2 = "Seoul"; // 주소 값만 바꿈, 한번 기록한 것은 지우지 못함.
	System.out.println("ob1==ob2: " + (ob1==ob2)); // true
	
	System.out.println(ob2);
	System.out.println(ob2.toString());
	
	}

}
