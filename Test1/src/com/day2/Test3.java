package com.day2;

class Test3 {
	public static void main(String[] args) {
		
		int r = 20;
		float a,l;

		a = r * r * 3.14f; // 10*10*3.14
//		a = (float)(r * r * 3.14); ���� ����ȯ
		l = r * 2 * 3.14f;

		System.out.printf("������ : %d, ���� : %f \n" ,r, a);
		System.out.printf("������ : %d, ���� : %.2f \n" ,r, a);  // %.2f : �Ҽ��� 2�ڸ� ����
		System.out.println("������ : " + r + ", �ѷ� : " + l);  // println�� �Ҽ��� �ڸ��� �ȵ�



	}
}
