package com.day4;

import java.io.IOException;
import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int num1, num2;
		char oper;

		System.out.print("첫번째 수? ");
		num1 = sc.nextInt();

		System.out.print("두번째 수? ");
		num2 = sc.nextInt();

		System.out.print("연산자[+,-,*,/]? ");
		oper = (char) System.in.read();

		switch (oper) {

		case '+':
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1+num2));
			break;
		case '-':
//			System.out.println(num1 - num2);
			System.out.printf("%d%c%d=%d\n", num1, oper, num2, (num1 - num2));
			break;
		case '*':
//			System.out.println(num1 * num2);
			System.out.printf("%d%c%d=%d\n", num1, oper, num2, (num1 * num2));
			break;
		case '/':
//			System.out.println(num1 / num2);
			System.out.printf("%d%c%d=%d\n", num1, oper, num2, (num1 / num2));
			break;
		}
		// %d(정수),%f(float),%g(double),%c(char),%s(String)
		sc.close();

	}

}

/*
  
  [자료형] 
  boolean : 1 byte (true/false)
  
  정수
  byte  : 1 byte -128 ~ 127
  short : 2 byte
  int   : 4 byte
  long  : 8 byte
  
  실수
  float  : 4 byte(단정도, 3.14f)
  double : 8 byte(배정도, 3.14)
  
  char : 2 byte ( UTF-16, 유니코드, \u0000) 'a'
  
  [연산자]
  산술연산자
  +, -, *, /, %, ++, --
  
  관계형 연산자
  >, <, >=, <= : true, false
  
  등가연산자
  ==, !=
  
  논리연산자
  &&(and), ||(or), !(not)
  
  비트연산자
  &, |, ^, ~, >>, <<, >>>   - 2진수 작업 연산자
  
  삼항연산자
  조건?참일때값:거짓일때값
  
  대입연산자
  =, +=, -=, *=, /=
  
  
  -------------------------------------------------
  
  int a = 10;
  float b;
  
  b = a;        - 암시적 형변환   int -> float   10 -> 10.0
  b = (float)a; - 명시적 형변환(강제 형변환)
  
  a = b;        - X
  a = (int)b;   -명시적 형변환
  
  
  -------------------------------------------------
  
  if(조건문){
  작업
  }
  
  if(조건문){
  작업1
  } else{
  작업2
  }
  
  if(조건문1){
  작업1
  } else if(조건문2){
  작업2
  } else if(조건문3){
  작업3
  } else{
  작업4
  
  while(조건문){
  작업
  }
  
  do{
  작업
  }while(조건문);
  
  while(true){
  작업
  }
  
  for(시작값;최대값;증가값){
  작업
  }
  
  
  
  
 */
