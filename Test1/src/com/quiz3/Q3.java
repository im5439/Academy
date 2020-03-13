package com.quiz3;

import java.util.Random;
import java.util.Scanner;

public class Q3 {

//	3. 1~3사이의 난수를 발생시켜 가위,바위,보 게임 프로그램 작성
//	  1:가위, 2:바위, 3:보
//
//	예)
//	1:가위, 2:바위, 3:보 ?1
//	컴퓨터 :보 사람 :가위
//	당신이 이겼습니다
//
//	1:가위, 2:바위, 3:보 ?1
//	컴퓨터 :바위 사람 :가위
//	컴퓨터가 이겼습니다

	public static void main(String[] args) {     // 반환값(return) : 자료형,String  / void 반환값 없음.  ||  public : 접근 지정자(누구나)  private : 접근 지정자(아무나x) 
                          // 매개변수
		Scanner sc = new Scanner(System.in);

		Random rd = new Random();

		int com ;
		int hum, i;
		String[] scom = { "가위", "바위", "보" };

		i = 0;

		com = rd.nextInt(3);

		scom[com].substring(0, 1);
//		System.out.println(scom[com]);

		System.out.print("1:가위, 2:바위, 3:보 ?(숫자입력) ");
		hum = sc.nextInt();

		scom[hum - 1].substring(0, 1);
//		System.out.println(scom[hum - 1]);

		System.out.println("컴퓨터 : " + scom[com] + "  사람 : " + scom[hum - 1]);

		if ((scom[com] == "가위" && scom[hum - 1] == "가위") || (scom[com] == "바위" && scom[hum - 1] == "바위")
				|| (scom[com] == "보" && scom[hum - 1] == "보")) {
			System.out.println("비겼습니다.");
		} else if ((scom[com] == "가위" && scom[hum - 1] == "바위") || (scom[com] == "바위" && scom[hum - 1] == "보")
				|| (scom[com] == "보" && scom[hum - 1] == "가위")) {
			System.out.println("당신이 이겼습니다.");
		} else if ((scom[com] == "가위" && scom[hum - 1] == "보") || (scom[com] == "바위" && scom[hum - 1] == "가위")
				|| (scom[com] == "보" && scom[hum - 1] == "바위")) {
			System.out.println("컴퓨터가 이겼습니다.");
		}

		sc.close();
	}
}
