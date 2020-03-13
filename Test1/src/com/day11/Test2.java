package com.day11;

import java.util.Calendar;
//import java.util.GregorianCalendar;

public class Test2 {

	public static void main(String[] args) {

		// Calendar
		Calendar now = Calendar.getInstance();
//		Calendar now = new GregorianCalendar(); //����ȯ�� ��

		int y = now.get(Calendar.YEAR); // ��
		int n = now.get(Calendar.MONTH) + 1; // ��(0~11) <- get�� ���� +1
		int d = now.get(Calendar.DATE); // ��
		int w = now.get(Calendar.DAY_OF_WEEK); // ���Ǽ�(1~7, �Ͽ��� : 1)
		
		String[] yoil = {"��","��","ȭ","��","��","��","��"};
		
		System.out.println(y + "-" + n + "-" + d + "-" + yoil[w-1]);
		
		System.out.println("-------------------------------------");
		//���� ù��, �������� ���ϱ�
		int startDay = now.getActualMinimum(Calendar.DATE); // 1
		int endDay = now.getActualMaximum(Calendar.DATE); // 29
		
		System.out.println(startDay + "~" + endDay);
		
		System.out.printf("%tF\n", now); // ���� ��¥ : 2020-02-26
		System.out.printf("%tT\n", now); // ���� �ð� : 11:11:41
		
		System.out.printf("%tF %tT\n", now, now);
		System.out.printf("%1$tF %1$tT\n", now);  // 1$ : ù��°�� �ִ� �μ�(now)�� ����Ұ��̴�.
		
		System.out.println("-------------------------------------");
		now.set(2021, 10-1, 10); // 2021�� 10�� 10�� <- set�� ���� -1
		
		y = now.get(Calendar.YEAR); // ��
		n = now.get(Calendar.MONTH) + 1; // ��(0~11) <- get�� ���� +1
		d = now.get(Calendar.DATE); // ��
		w = now.get(Calendar.DAY_OF_WEEK); // ���Ǽ�(1~7, �Ͽ��� : 1)
		
		System.out.println(y + "-" + n + "-" + d + "-" + yoil[w-1]);
		
	}

}
