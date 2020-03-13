package com.quiz1;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

//		이름과 3과목의 점수를 입력 받아 다음조건에 따라 출력
//		-모든 과목의 점수가 40점 이상이고 평균이 60점 이상이면 합격
//		-한과목이라도 40점 미만이고 평균이 60점 이상이면 과락
//		-평균이 60점 미만이면 불합격
//
//	    이름 ? 홍길동
//	    세과목 점수 ? 60 70 80
//	    이름 : 홍길동
//		총점 : 210, 평균 : 70, 판정 :합격

		Scanner sc = new Scanner(System.in);

		int score1, score2, score3, aver, tscore;
		String name, jud;

		System.out.print("이름을 입력하세요. ");
		name = sc.next();

		System.out.print("3과목 점수를 입력하세요.(ex 60 70 80) ");
		score1 = sc.nextInt();
		score2 = sc.nextInt();
		score3 = sc.nextInt();

		tscore = score1 + score2 + score3;
		aver = (tscore) / 3;

		if (aver >= 60 && score1 > 40 && score2 > 40 && score3 > 40) {
			jud = "합격";
		} else {
			jud = "불합격";
		}

		System.out.println("이름 : " + name + "\n" + "총점 : " + tscore + ", " + "평균 : " + aver + ", " + "판정 : " + jud);

		sc.close();
	}

}
