package com.day4;

import java.io.IOException;
import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int num1, num2;
		char oper;

		System.out.print("ù��° ��? ");
		num1 = sc.nextInt();

		System.out.print("�ι�° ��? ");
		num2 = sc.nextInt();

		System.out.print("������[+,-,*,/]? ");
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
		// %d(����),%f(float),%g(double),%c(char),%s(String)
		sc.close();

	}

}

/*
  
  [�ڷ���] 
  boolean : 1 byte (true/false)
  
  ����
  byte  : 1 byte -128 ~ 127
  short : 2 byte
  int   : 4 byte
  long  : 8 byte
  
  �Ǽ�
  float  : 4 byte(������, 3.14f)
  double : 8 byte(������, 3.14)
  
  char : 2 byte ( UTF-16, �����ڵ�, \u0000) 'a'
  
  [������]
  ���������
  +, -, *, /, %, ++, --
  
  ������ ������
  >, <, >=, <= : true, false
  
  �������
  ==, !=
  
  ��������
  &&(and), ||(or), !(not)
  
  ��Ʈ������
  &, |, ^, ~, >>, <<, >>>   - 2���� �۾� ������
  
  ���׿�����
  ����?���϶���:�����϶���
  
  ���Կ�����
  =, +=, -=, *=, /=
  
  
  -------------------------------------------------
  
  int a = 10;
  float b;
  
  b = a;        - �Ͻ��� ����ȯ   int -> float   10 -> 10.0
  b = (float)a; - ����� ����ȯ(���� ����ȯ)
  
  a = b;        - X
  a = (int)b;   -����� ����ȯ
  
  
  -------------------------------------------------
  
  if(���ǹ�){
  �۾�
  }
  
  if(���ǹ�){
  �۾�1
  } else{
  �۾�2
  }
  
  if(���ǹ�1){
  �۾�1
  } else if(���ǹ�2){
  �۾�2
  } else if(���ǹ�3){
  �۾�3
  } else{
  �۾�4
  
  while(���ǹ�){
  �۾�
  }
  
  do{
  �۾�
  }while(���ǹ�);
  
  while(true){
  �۾�
  }
  
  for(���۰�;�ִ밪;������){
  �۾�
  }
  
  
  
  
 */
