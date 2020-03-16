package com.day17;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test11 {

	public static void main(String[] args) {

		try {

			FileOutputStream fos;
			PrintStream ps;

			fos = new FileOutputStream("d:\\doc\\out4.txt");
			ps = new PrintStream(fos);
			ps.println("배수지");
			ps.println("유인나");
			ps.println("angelina");

			ps.close();
			fos.close();

			fos = new FileOutputStream("d:\\doc\\out4.txt", true);// true는 누적 append
			ps = new PrintStream(fos);
			ps.println("김수지");
			ps.println("안인나");
			ps.println("kangelina");

			ps.close();
			fos.close();

		} catch (Exception e) {

		}

	}

}
