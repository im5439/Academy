package com.day18;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

// ��ü�� ����ȭ
// �޸𸮿� ������ Ŭ���� ��ü�� �������(�ν��Ͻ� ����)�� ������¸� �״�� �����ؼ� ���Ͽ� �����ϰų� ��Ʈ��ũ�� ���� ������ �� �ִ� ���
// ������ ����Ʈ  �����θ� �����͸� �ۼ���

// ���� : ��ü ��ü�� ������ ����� ���Ŀ� ���ֹ��� �ʰ� ��ü�� ���������ν� ���Ӽ��� �����Ҽ� �ִ�.
// ��ü ��ü�� ��Ʈ��ũ�� ���� �ս��� ��ȯ �Ҽ� �ִ�.

// implements Serializable�� ���� (�޼ҵ�� ����)
// Serializable : ��ü�� ����ȭ�� �� private �ʵ带 ������ ��� �ʵ带 ����Ʈ�� ��ȯ�ص� ���ٴ� ǥ�� ����


public class Test6 {

	public static void main(String[] args) {

		Hashtable<String, String> h = new Hashtable<>();
		
		h.put("1", "�����");
		h.put("2", "���γ�");
		h.put("3", "��������"); // ����ȭ�� �� ����.
		
		try {

			FileOutputStream fos = new FileOutputStream("d:\\doc\\out8.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(h); // UPCAST
			oos.close();
			fos.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
