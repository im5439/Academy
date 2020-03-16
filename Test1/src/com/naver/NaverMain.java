package com.naver;

import java.util.Scanner;

//List Collection으로 회원가입 만들기
//메뉴 : 회원가입,회원전체출력, 아이디검색...
//조건 : 회원가입시 아이디는 8~15자 이내, 영문자 숫자 혼용
//ID, PW1, PW2, NAME, GENDER, BIRTH(String), EMAIL, TEL(String)
//PW1 PW2 비교하여 하나만 저장
//입력 출력 삭제 아이디검색
/*
 * public void input(); // 회원가입
	public void print(); // 회원목록출력
	public void delete(); // 회원탈퇴
	public void updata(); // 정보수정
	public void findId(); // 아이디검색
	public void findName(); // 이름검색
*/

public class NaverMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Naver ob = new NaverImpl();

		MyException auth = new MyException();

		String set;
		
		ob.readInfo();

		while (true) {
			try {
				System.out.println("----------------------------------------------------------------------------");
				System.out.println("                                 <메인메뉴>");
				System.out.println(" 1.회원가입 2.회원목록 3.회원탈퇴 4.정보수정 5.아이디검색 6.이름검색 7.종료");
				System.out.println();
				System.out.println("----------------------------------------------------------------------------");
				System.out.print("> ");
				set = sc.next();

				auth.inputformat(set);

				switch (set) {

				case "1":
					ob.input();
					break;
				case "2":
					ob.print();
					break;
				case "3":
					ob.delete();
					break;
				case "4":
					ob.updata();
					break;
				case "5":
					ob.findId();
					break;
				case "6":
					ob.findName();
					break;
				case "7":
					ob.saveInfo();
					System.out.println("<프로그램 종료>");
					System.exit(0);
				default:
					System.out.println("잘못입력되었습니다.(1~7)");
					continue;
				}
			} catch (Exception e) {
				System.out.println("숫자만 입력가능 합니다.1");
			}

		}
	}

}
