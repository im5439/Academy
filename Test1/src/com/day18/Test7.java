package com.day18;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Hashtable;
import java.util.Iterator;

// Test6에 저장한 out8.txt 읽어내기

public class Test7 {

	public static void main(String[] args) {

		// 역직렬화

		try {

			FileInputStream fis = new FileInputStream("d:\\doc\\out8.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Hashtable<String, String> h = (Hashtable<String, String>) ois.readObject(); // DOWNCAST

			Iterator<String> it = h.keySet().iterator();
			while (it.hasNext()) {

				String key = it.next();
				String value = h.get(key);
				System.out.println(key + " : " + value);

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
