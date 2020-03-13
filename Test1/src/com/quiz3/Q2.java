package com.quiz3;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Q2 {

//	2. 1~10사이의 난수를 발생시켜 발생시킨 난수를 3번안에 알아 맞추는 게임
//	   (3번안에 알아맞추지 못하면 발생된 난수를 출력)
//
//	예)
//	정수입력?[1번째기회] : 3
//	틀렸어요!!
//	정수입력?[2번째기회] : 5
//	틀렸어요!!
//	정수입력?[3번째기회] : 7
//	틀렸어요!!
//
//	정답은 2입니다
//
//	계속할래?[Y/N] : 
//	------------------------------
//	정수입력?[1번째기회] : 7
//	틀렸어요!!
//	정수입력?[2번째기회] : 4
//	틀렸어요!!
//	정수입력?[3번째기회] : 9
//	맞았어요!!
//
//	정답은 9입니다
//
//	계속할래?[Y/N] : 

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		Random rd = new Random();

		int num;

		int i, n;
		char yn = 0;

		n = rd.nextInt(10) + 1;

		System.out.println("1~10사이의 난수를 발생시켜 발생시킨 난수를 3번안에 알아 맞추는 게임");
		i = 0;
		while (true) {
			System.out.print("정수입력?[" + (i + 1) + "번째기회] : ");
			num = sc.nextInt();
			if (num != n) {
				System.out.println("틀렸어요!!");
				i++;
			} else if (num == n) {
				System.out.println("맞았어요!!");
				System.out.println("\n정답은" + n + "입니다.");
				System.out.print("\n계속할래?[Y/N] : ");
				yn = (char) System.in.read();
				n = rd.nextInt(10) + 1;
				i = 0;
				if (yn != 'Y' && yn != 'y') {
					System.out.println("종료");
					break;
				} else {
					System.out.println();
				}
			}

			if ((i + 1) > 3) {
				System.out.println("\n정답은" + n + "입니다.");
				System.out.print("\n계속할래?[Y/N] : ");
				yn = (char) System.in.read();
				n = rd.nextInt(10) + 1;
				i = 0;
				if (yn != 'Y' && yn != 'y') {
					System.out.println("종료");
					break;
				} else {
					System.out.println();
				}
			}

		}
		sc.close();
	}

}
