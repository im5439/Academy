package com.quiz5;

public class Q3 {

	public static void main(String[] args) {
/*		
	  1) 자바를 컴파일하고 실행하는 방법
         cmd로 경로이동을하여 javac와 함께 해당 파일을 입력한다. javac 파일명.java 이렇게 명령하면 컴파일이 되여 class파일이 생성된다.
		 그리고 java 파일명을 입력하면 실행된다. 
		
	  2) 자바의 기본 자료형및 크기
		boolean - 1byte 
		char - 2byte
		byte - 1byte
		short - 2byte
		int - 4byte
		long - 8byte
		float - 4byte
		double - 8byte 
*/	 
//	  3) 삼항연산자의 형식및 간단한 예제 만들기
//		변수 = 조건문 ? true : false
		int a = 5;
		int b = a > 0 ? 10 : 5;
		System.out.println(b);
//		print -> 10
//
//	  4) 제어문의 종류및 형식을 설명하고 제어문당 간단한 예제 하나씩 만들기
//		 if문 - 조건을 입력하고 true면 값을 출력하고 false면 넘어간다.
		 if(a > 0) {
			System.out.println("a는 0보다 크다."); 
		 } else
			 System.out.println("0보다 작다.");
//		 for문 - for(시작값;최대값;증가값;) 시작값부터 최대값까지 반복한다.
		 for(int i = 1; i < 10; i++) {
			 System.out.print(i);
		 }
		 System.out.println();
//		 while - while(최대값) 초기화 값 부터 최대값까지 반복
		 int t = 1;
		 while(t < 10) {
			 System.out.print(t);
			 t++;
		 }
		 System.out.println();
//		 do while - 초기값 부터 최대값반복 무조건 한번은 실행
		 int i =1;
		 do {
			 System.out.print(i);
			 i++;
		 }while(i<10);
		 System.out.println();
//		 switch 
		 int n = 1;
		 switch(n) {
		 case 1 :
			 System.out.println("n은 1");
			 break;
		 case 2 :
			 System.out.println("n은 2");
			 break;
		 }
/*	
	  5) 배열의 개요및 배열의 생성,초기값을 부여하는 방법
		 배열은 연관된 데이터를 모아서 관리하기 위해서 사용하는 데이터 타입
		 int[] ab = {1 ,2 ,3};
		 
	  6) 생성자,디폴트생성자 개요
		 생성자
		 - 객체가 생성될 때에 변수에게 초기값을 제공하고 필요한 초기화 절차를 실행하는 메소드
		 - 인스턴스 변수를 초기화하는것이 목적이다. 하나의 변수를 동시에 여러개의 값으로 초기화할 수 있다.
       
		 디폴트생성자
		 - 매개변수가 없는 생성자
		 - 클래스에 생성자가 하나도 없으면 컴파일러가 기본 생성자를 추가한다.
		    ( 생성자가 하나라도 있으면 컴파일러는 기본 생성자를 추가하지 않는다.)

	  7) 메소드 오버로딩이란
		 이름은 같지만 시그니처는 다른 메소드를 중복으로 선언 할 수 있는 방법
		 
	  8) private, protected, public 이란?
		 접근지정자  private는 클래스 안에서만 사용 가능한 메소드, protected는 패키지 안에서만 사용 가능한 메소드
		             public은 모두 사용 가능한 메소드
		 
	  9) import문의 형식
		 import 패키지명.클래스명;
		 
	  10) this, super ?
		 this는 자기 자신(클래스)를 뜻함, super는 부모클래스를 뜻함.
		 
	  11) final,static
		 final은 인스턴스 변수에서는 초기화가 한번만 가능하고, 메소드에서는 오버라이딩이 불가능하고, 클래스에서는 상속이 불가능하다.
		 static은 
		 
	  12) 상속이란 ?
		 부모 클래스의 메소드를 자식 클래스가 사용 가능 
		 
	  13) Object 클래스 ?
		 모든 클래스의 조상
		 
	  14) 메소드 오버라이딩 ?
		 부모클래스의 메소드명을 자식클래스의 메소드명과 같은 메소드명을 부여하고 메소드 값 출력은 자식클래스의 값을 출력한다.
       상속관계에서 부모가 가지고 있는 메소드를 재정의 한다.
		 
	  15) String에 대하여 간단히 설명하고 중요메소드 10개만 설명 또는 사용법?
        저장하는 데이터가 크고, 한번 기록한것은 지우지 못한다.(불변의 법칙)
		  split - 배열로 나누기, equals - 값 비교 , equalsIgnoreCase - 대소문자 구분않고 비교,  indexOf - 앞에서부터 인덱스값 읽음, lastindexOf - 뒤에서부터 인덱스값 읽음
		  replaceAll(a,b) - a를 b로 바꿔라, trim() - 양쪽 공백을 없앤다. length() - 문자 길이 출력, startsWith("") - 시작값이 ""인가
		 
	  16) StringBuffer에 대하여 간단히 설명
		 StringBuffer는 동기화가 가능하다. 동기화가 불가능한 StringBuilder에 비해 연산속도는 느리다.
		 
	  17) Calendar 클래스에 대한 간단한 설명(객체생성방법, 주요메소드등)
		 Calendar 변수 = Calendar.getInstance(); 로 생성한다.
		 객체 생성 방법은 get, set으로 생성
		 YEAR - 년도  MONTH - 월  DATE - 일  DAY_OF_WEEK - 주의 수
		 
		 
	  18) 추상 클래스 ?
		  메모리의 낭비 없이 클래스를 미리 설계하고 메소드를 재정의 해서 사용
*/	 
	}

}
