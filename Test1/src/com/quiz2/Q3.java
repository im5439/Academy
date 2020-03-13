package com.quiz2;

public class Q3 {

	public static void main(String[] args) {

//		3. 1-2+3-4+5-6+7-8+9-10 (Â¦¼ö´Â - , È¦¼ö´Â +) = -5

		int jsum = 0;
		int hsum = 0;

		for (int i = -2; i >= -10; i -= 2) {

			jsum += i;

		}

		for (int j = 1; j <= 10; j += 2) {

			hsum += j;

		}

		System.out.println("1-2+3-4+5-6+7-8+9-10 = " + (hsum + jsum));

	}

}
