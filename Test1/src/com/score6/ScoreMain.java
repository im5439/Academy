package com.score6;

import java.util.Scanner;

import com.db.DBConn;

public class ScoreMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Score ob = new Score();
		
		int ch;
		
		try {
			
			while(true) {
				
				do {
					System.out.println("1.입력  2.수정  3.삭제  4.전체출력  5.이름검색  6.종료");
					ch = sc.nextInt();
				} while(ch < 1 || ch > 6);
				
				switch(ch) {
				
				case 1 :
					ob.insertData();
					break;
				case 2 :
					ob.updateData();
					break;
				case 3 :
					if(ob.deleteData() != 0) {
						System.out.println("삭제 완료!");
					}
					break;
				case 4 :
					ob.selectAll();
					break;
				case 5 :
					ob.nameSearch();
					break;
				case 6 :
					DBConn.close();
					System.out.println("종료");
					System.exit(0);

				}
				
				
				
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	

}
