package com.naver;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//List Collection으로 회원가입 만들기
//메뉴 : 회원가입,회원전체출력, 아이디검색...
//조건 : 회원가입시 아이디는 8~15자 이내, 영문자 숫자 혼용   48~57 65~90 97~122
//ID, PW1, PW2, NAME, GENDER, BIRTH(String), EMAIL, TEL(String)
//PW1 PW2 비교하여 하나만 저장
//입력 출력 삭제 아이디검색

public class NaverImpl implements Naver {

	ArrayList<NaverVO> lists = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	String id, pw, name;

	@Override
	public void input() {

		NaverVO vo = new NaverVO();

		while (true) {
			System.out.print("ID(8~15자 이내, 영문/숫자 혼용) : ");
			vo.setId(sc.next());

			// id중복검사
			Iterator<NaverVO> it = lists.iterator();
			while (it.hasNext()) {
				NaverVO vo1 = it.next();
				if (vo1.getId().equals(vo.getId())) {
					System.out.println("중복된 아이디입니다.");
					return;
				}
			}

			for (int i = 0; i < vo.getId().length(); i++) {
				char ch = vo.getId().charAt(i);
				if ((ch < 48 || ch > 57) && (ch < 65 || ch > 90) && (ch < 97 || ch > 122)) {
					System.out.println("ID는 영문자, 숫자만 가능");
					continue;
				}
			}

			if (vo.getId().length() < 7 || vo.getId().length() > 16) {
				System.out.println("ID는 8~15자 이내");
				continue;
			}

			// 입력받은 id의 영문/숫자 혼용인지 확인
			int num = 0;
			int eng = 0;
			for (int i = 0; i < vo.getId().length(); i++) {
				char ch = vo.getId().charAt(i);
				if (ch >= 48 && ch <= 57) {
					num++;
				} else if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
					eng++;
				}
			}
			if (num == 0 || eng == 0) {
				System.out.println("영문/숫자 혼용");
				continue;
			}
			break;
		}

		while (true) {
			System.out.print("PW : ");
			vo.setPw(sc.next());

			// PW 같은지 확인
			System.out.print("PW 확인 : ");
			pw = sc.next();
			if (!pw.equals(vo.getPw())) {
				System.out.println("처음 비밀번호와 다릅니다.");
				continue;
			}
			break;
		}

		System.out.print("이름 : ");
		vo.setName(sc.next());

		System.out.print("성별 : ");
		vo.setGender(sc.next());

		System.out.print("생년월일 : ");
		vo.setBirth(sc.next());

		System.out.print("E-Mail : ");
		vo.setEmail(sc.next());

		System.out.print("전화번호 : ");
		vo.setTel(sc.next());

		lists.add(vo);

		System.out.print("\n가입중");
		thread();
		System.out.println("\n\n가입완료!!\n");
	}

	@Override
	public void print() {

		System.out.print("\n목록을 불러오는중");
		thread();

		System.out.println();
		Iterator<NaverVO> it = lists.iterator();
		System.out.println("현재 회원수: " + lists.size());
		while (it.hasNext()) {

			NaverVO vo = it.next();
			System.out.print(vo.toString());
		}
		System.out.println();

	}

	@Override
	public void delete() {

		System.out.print("삭제할 ID를 입력하세요. : ");
		id = sc.next();

		System.out.print("비밀번호를 입력하세요. : ");
		pw = sc.next();

		Iterator<NaverVO> it = lists.iterator();
		while (it.hasNext()) {

			NaverVO vo = it.next();

			if (id.equals(vo.getId()) && pw.equals(vo.getPw())) {
//				System.out.print("정말로 삭제하시겠습니까?(Y/N) ");
//				char yn = (char) sc.nextByte();
//				if (yn == 'Y' || yn == 'y') {
				lists.remove(vo);
				System.out.println("삭제완료!");
				return;
//				} else {
//					System.out.println("취소");
//					return;
//				}
			} else
				System.out.println("아이디 또는 비밀번호가 틀렸습니다.");

		}

	}

	@Override
	public void updata() {

		System.out.println(" <회원정보수정>");
		System.out.print("ID : ");
		id = sc.next();

		System.out.print("PW : ");
		pw = sc.next();

		Iterator<NaverVO> it = lists.iterator();
		while (it.hasNext()) {

			NaverVO vo = it.next();

			MyException auth = new MyException();

			if (id.equals(vo.getId()) && pw.equals(vo.getPw())) { // id, PW 둘다 일치하는지 확인

				while (true) {
					try {
						System.out.println("----------------------------------------------------------");
						System.out.println("              <수정할 항목을 고르세요.>");
						System.out.println("1.PW 2.이름 3.성별 4.생년월일 5.E-Mail 6.전화번호 7.나가기");
						System.out.println("----------------------------------------------------------");
						System.out.print("> ");
						String set = sc.next();

						auth.inputformat(set);

						switch (set) {
						case "1":
							while (true) {
								System.out.print("변경할 PW : ");
								vo.setPw(sc.next());

								// PW 같은지 확인
								System.out.print("PW 확인 : ");
								pw = sc.next();
								if (!pw.equals(vo.getPw())) {
									System.out.println("처음 비밀번호와 다릅니다.");
									continue;
								}
								break;
							}
							System.out.println("변경완료!");
							continue;
						case "2":
							System.out.print("변경할 이름 : ");
							vo.setName(sc.next());
							System.out.println("변경완료!");
							continue;
						case "3":
							System.out.print("변경할 성별 : ");
							vo.setGender(sc.next());
							System.out.println("변경완료!");
							continue;
						case "4":
							System.out.print("변경할 생년월일 : ");
							vo.setBirth(sc.next());
							System.out.println("변경완료!");
							continue;
						case "5":
							System.out.print("변경할 E-Mail : ");
							vo.setEmail(sc.next());
							System.out.println("변경완료!");
							continue;
						case "6":
							System.out.print("변경할 전화번호 : ");
							vo.setTel(sc.next());
							System.out.println("변경완료!");
							continue;
						case "7":
							System.out.println("메인화면으로...");
							break;
						default:
							System.out.println("잘못입력되었습니다.(1~7)");
							continue;
						}
					} catch (Exception e) {
						System.out.println("숫자만 입력 가능합니다.");
						continue;
					}

					return;
				}

			}

		}

	}

	@Override
	public void findId() {

		System.out.print("검색할 ID를 입력하세요. : ");
		id = sc.next();

		System.out.print("\n검색중");
		thread();
		System.out.println();

		Iterator<NaverVO> it = lists.iterator();
		while (it.hasNext()) {

			NaverVO vo = it.next();

			if (id.equals(vo.getId())) {
				System.out.println(vo.toString());
				return;
			} else if (!id.equals(vo.getId()))
				System.out.println("잘못된 ID입니다.");

		}

	}

	@Override
	public void findName() {

		System.out.print("검색할 이름을 입력하세요. : ");
		name = sc.next();

		System.out.print("\n검색중");
		thread();
		System.out.println();
		Iterator<NaverVO> it = lists.iterator();
		while (it.hasNext()) {

			NaverVO vo = it.next();

			if (name.equals(vo.getName())) {
				System.out.println(vo.toString());
				return;
			} else if (!name.equals(vo.getName()))
				System.out.println("잘못된 이름입니다.");

		}

	}

	@Override
	public void saveInfo() {

		try {
			FileOutputStream fos = new FileOutputStream("d:\\doc\\saveInfo.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(lists);
			oos.close();
			fos.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.print("회원목록 저장중");
		thread();
		System.out.println("\n회원목록 저장완료!!");

	}

	@Override
	public void readInfo() {

		try {

			FileInputStream fis = new FileInputStream("d:\\doc\\saveInfo.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			ArrayList<NaverVO> list = (ArrayList<NaverVO>) ois.readObject();
			
			Iterator<NaverVO> it = list.iterator();
			while(it.hasNext()) {
				
				NaverVO vo = it.next();
				lists.add(vo);
				
			}
			
			
			ois.close();
			fis.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void thread() {

		Thread t = new Thread(new MyThread());
		t.start();
		try {
			t.join();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
