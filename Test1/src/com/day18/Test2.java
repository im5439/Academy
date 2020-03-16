package com.day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

// FileWriter
// ����� �����ڵ� ���ڿ��� �ý��ۿ� �´� ����Ʈ ���� ���ڵ��� ����Ʈ�� ��ȯ�ؼ� ����.

// BufferedWriter
// ���ͽ�Ʈ������ �ٸ� ��� ��Ʈ���� �������� �μ��� ������ ���ڸ� ���۸� �ϴ� �Ϳ� ���� ����, �迭 �Ǵ� ��Ʈ������ �������¸� ���.
// ����, Byte ��Ʈ���� ���۷� ���.

public class Test2 {

	public static void main(String[] args) {

		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			FileWriter fw = new FileWriter("d:\\doc\\out6.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			String str;
			
			System.out.println("���ڿ�?");
			
			while((str = br.readLine()) != null) {
				bw.write(str);
				bw.newLine(); // str + "\r\n" : ����
			}
			
			bw.close();
			fw.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
