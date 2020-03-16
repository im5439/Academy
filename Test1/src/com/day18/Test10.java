package com.day18;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

// Externalizable(인터페이스)
// Serialzable의 하위 인터페이스로 같은 기능을 하되 좀 더 완벽한 제어가 가능.
// writeExternal(), readExternal() 메소드를 정의해줘야 함.
// Serialzable을 더 많이씀

class DataTest implements Externalizable {

	String name;
	int age;
	
	public DataTest() { // 기본생성자 있어야함
	}
	
	public DataTest(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " : " + age;
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		name = (String) in.readObject();
		age = in.readInt();
		System.out.println("readExternal...");
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
	
		out.writeObject(name);
		out.writeInt(age);
		System.out.println("writeExternal...");
		
	}
	
	
	
}

public class Test10 {

	public static void main(String[] args) {

		try {
			
			DataTest ob = new DataTest("유인나", 40);
			
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out12.txt");
			ObjectOutput oos = new ObjectOutputStream(fos);

			oos.writeObject(ob);
			
			FileInputStream fis = new FileInputStream("d:\\doc\\out12.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			DataTest t = (DataTest) ois.readObject();
			System.out.println(t.toString());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
