package com.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test8 {

	public static void main(String[] args) {

		try {

			FileOutputStream fos = new FileOutputStream("d:\\doc\\output.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(new MyData("홍길동", 100));
			oos.writeObject(new MyData("이길동", 50));
			oos.writeObject(new MyData("박길동", 80));
			oos.writeObject(new MyData("최길동", 40));
			oos.writeObject(new MyData("김길동", 70));

			oos.close();
			fos.close();

			// 역직렬화

			FileInputStream fis = new FileInputStream("d:\\doc\\output.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			MyData ob = null;

			while (true) {
				ob = (MyData) ois.readObject();
				if (ob == null) {
					break;
				}
				System.out.println(ob.toString());
			}
			
			ois.close();
			fis.close();
			

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
