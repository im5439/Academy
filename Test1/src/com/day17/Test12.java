package com.day17;

import java.io.File;
import java.io.IOException;
import java.util.Date;

//File
//���� �� ������ ������ �� �ֵ��� ����� �������ִ� Ŭ����
//���Ͽ� ���� �Ǵ� �̸����� ���� ������ �� ��쿡�� ���ǰ�
//������ ������ ����� �ϴ� ����� ����


public class Test12 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("d:\\doc\\test.txt");
		
		System.out.println("���ϸ�: " + f.getName());
		System.out.println("����ũ��: " + f.length());
		System.out.println("����������: " + f.getAbsolutePath());//������
		System.out.println("����ǥ�ذ��: " + f.getCanonicalPath());
		System.out.println("���ϻ�����: " + new Date(f.lastModified()));//������ ������
		System.out.println("���ϻ������: " + f.getParent()); 
		System.out.println("�б�Ӽ�: " + f.canRead());
		System.out.println("����Ӽ�: " + f.canWrite());
		
		//���� �۾����
		String path = System.getProperty("user.dir");
		System.out.println("���� �۾����: " + path);
		
		
		

	}

}
