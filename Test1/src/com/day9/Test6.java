package com.day9;

// ������ �μ� - ��︸ �ϼ�, �߿�x
// �迭�� ũ�⸦ �������� ���� , data�� ������ ũ�⸦ ����
// ũ�Ⱑ �������� ���� �迭

public class Test6 {
	
	int sum(int...args) { // ...�� �ݵ�� 3��
		
		int s = 0;
		
		for(int i = 0; i < args.length; i++) {
			s += args[i];
		}
		
		return s;
		
	}

	public static void main(String[] args) {

		Test6 ob = new Test6();
		
		int result;
		
		result = ob.sum(2,4,6,8);
		System.out.println(result);
		
		result = ob.sum(1,3,5,7,9,13,15,17,19);
		System.out.println(result);
		
	}

}
