package com.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test9 implements Serializable{

	private static final long serialVersionUID = 1L;

	private String name;
	private String id;
	private transient String pwd; // transient 저장안함
	
	public Test9(String name, String id, String pwd) {
		this.name = name;
		this.id = id;
		this.pwd = pwd;
	}
	
	public void print() {
		System.out.println(name + " : " + id + " : "  + pwd);
	}
	
	public static void main(String[] args) {

		Test9 ob = new Test9("배수지","suzi","123");

		try {
			
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out10.txt"); // 직렬화
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(ob);
			oos.close();
			fos.close();

			
			FileInputStream fis = new FileInputStream("d:\\doc\\out10.txt"); // 역직렬화
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Test9 t = (Test9) ois.readObject();
			
			t.print();
			
			ois.close();
			fis.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
