package com.day11;

import java.util.Calendar;
//import java.util.GregorianCalendar;

public class Test2 {

	public static void main(String[] args) {

		// Calendar
		Calendar now = Calendar.getInstance();
//		Calendar now = new GregorianCalendar(); //형변환이 됨

		int y = now.get(Calendar.YEAR); // 년
		int n = now.get(Calendar.MONTH) + 1; // 월(0~11) <- get은 월에 +1
		int d = now.get(Calendar.DATE); // 일
		int w = now.get(Calendar.DAY_OF_WEEK); // 주의수(1~7, 일요일 : 1)
		
		String[] yoil = {"일","월","화","수","목","금","토"};
		
		System.out.println(y + "-" + n + "-" + d + "-" + yoil[w-1]);
		
		System.out.println("-------------------------------------");
		//달의 첫날, 마지막날 구하기
		int startDay = now.getActualMinimum(Calendar.DATE); // 1
		int endDay = now.getActualMaximum(Calendar.DATE); // 29
		
		System.out.println(startDay + "~" + endDay);
		
		System.out.printf("%tF\n", now); // 현재 날짜 : 2020-02-26
		System.out.printf("%tT\n", now); // 현재 시간 : 11:11:41
		
		System.out.printf("%tF %tT\n", now, now);
		System.out.printf("%1$tF %1$tT\n", now);  // 1$ : 첫번째에 있는 인수(now)를 사용할것이다.
		
		System.out.println("-------------------------------------");
		now.set(2021, 10-1, 10); // 2021년 10월 10일 <- set은 월에 -1
		
		y = now.get(Calendar.YEAR); // 년
		n = now.get(Calendar.MONTH) + 1; // 월(0~11) <- get은 월에 +1
		d = now.get(Calendar.DATE); // 일
		w = now.get(Calendar.DAY_OF_WEEK); // 주의수(1~7, 일요일 : 1)
		
		System.out.println(y + "-" + n + "-" + d + "-" + yoil[w-1]);
		
	}

}
