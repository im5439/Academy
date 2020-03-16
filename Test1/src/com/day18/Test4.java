package com.day18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// DataInputStream
// �ڹ��� �ڷ����� ���� ������ �ֵ��� �ϴ� ��Ʈ��
// �̷��� �б� ������ �÷������� �����ϰ� �۵��Ѵ�.


public class Test4 {

	public static void main(String[] args) {

		try {
			
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out7.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeUTF("���ѹα�");
			dos.writeByte(10);
			dos.writeChar('A');
			dos.writeInt(50);
			
			fos.close();
			
			FileInputStream fis = new FileInputStream("d:\\doc\\out7.txt");
			DataInputStream dis = new DataInputStream(fis);
			
			System.out.println(dis.readUTF());
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			
			fis.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
