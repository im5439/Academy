package com.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int su;
		int sum = 0;
		char ch;

		while (true) { // 무한루프

			do {
				System.out.print("수 입력? ");
				su = Integer.parseInt(br.readLine());
			} while (su < 1 || su > 5000);

			sum = 0;
			for (int i = 1; i <= su; i++) {
				sum += i;
			}

			System.out.println("1~" + su + "까지의 합 : " + sum);

			// 계속 진행할지 여부
			System.out.print("계속할래?[Y/N] ");// Y,y,N,n,a,d아니
			ch = (char) System.in.read();

			if (ch != 'Y' && ch != 'y') { // ch != 'Y' && ch != 'y'   <= 양쪽 모두 !=(not) 일 때 &&(O), ||(X)

				System.out.println("종료");
				break;
				// while, do-while, for, switch
			}
		
			System.in.skip(2); // ASCII값 - Enter(10,13)삭제 해야 error 안뜸.   => BufferedReader에서만

		}//end...while(true)
		
	}

}
