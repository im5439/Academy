package com.naver;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//List Collection���� ȸ������ �����
//�޴� : ȸ������,ȸ����ü���, ���̵�˻�...
//���� : ȸ�����Խ� ���̵�� 8~15�� �̳�, ������ ���� ȥ��   48~57 65~90 97~122
//ID, PW1, PW2, NAME, GENDER, BIRTH(String), EMAIL, TEL(String)
//PW1 PW2 ���Ͽ� �ϳ��� ����
//�Է� ��� ���� ���̵�˻�

public class NaverImpl implements Naver {

	ArrayList<NaverVO> lists = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	String id, pw, name;

	
	@Override
	public void input() {

		NaverVO vo = new NaverVO();

		while (true) {
			System.out.print("ID(8~15�� �̳�, ����/���� ȥ��) : ");
			vo.setId(sc.next());

			// id�ߺ��˻�
			Iterator<NaverVO> it = lists.iterator();
			while (it.hasNext()) {
				NaverVO vo1 = it.next();
				if (vo1.getId().equals(vo.getId())) {
					System.out.println("�ߺ��� ���̵��Դϴ�.");
					return;
				}
			}
			
			for (int i = 0; i < vo.getId().length(); i++) {
				char ch = vo.getId().charAt(i);
				if ((ch < 48 || ch > 57) && (ch < 65 || ch > 90) && (ch < 97 || ch > 122)) {
					System.out.println("ID�� ������, ���ڸ� ����");
					continue;
				}
			}
			
			if (vo.getId().length() < 7 || vo.getId().length() > 16) {
				System.out.println("ID�� 8~15�� �̳�");
				continue;
			}


			// �Է¹��� id�� ����/���� ȥ������ Ȯ��
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
				System.out.println("����/���� ȥ��");
				continue;
			}
			break;
		}

		while (true) {
			System.out.print("PW : ");
			vo.setPw(sc.next());

			// PW ������ Ȯ��
			System.out.print("PW Ȯ�� : ");
			pw = sc.next();
			if (!pw.equals(vo.getPw())) {
				System.out.println("ó�� ��й�ȣ�� �ٸ��ϴ�.");
				continue;
			}
			break;
		}
		
		System.out.print("�̸� : ");
		vo.setName(sc.next());

		System.out.print("���� : ");
		vo.setGender(sc.next());

		System.out.print("������� : ");
		vo.setBirth(sc.next());

		System.out.print("E-Mail : ");
		vo.setEmail(sc.next());

		System.out.print("��ȭ��ȣ : ");
		vo.setTel(sc.next());
		
		lists.add(vo);
		
		System.out.print("\n������");
		thread();
		System.out.println("\n\n���ԿϷ�!!\n");
	}

	@Override
	public void print() {
		
		System.out.print("\n����� �ҷ�������");
		thread();
		
		System.out.println();
		Iterator<NaverVO> it = lists.iterator();
		System.out.println("���� ȸ����: " + lists.size());
		while (it.hasNext()) {

			NaverVO vo = it.next();
			System.out.print(vo.toString());
		}
		System.out.println();

	}

	@Override
	public void delete() {

		System.out.print("������ ID�� �Է��ϼ���. : ");
		id = sc.next();

		System.out.print("��й�ȣ�� �Է��ϼ���. : ");
		pw = sc.next();

		Iterator<NaverVO> it = lists.iterator();
		while (it.hasNext()) {

			NaverVO vo = it.next();

			if (id.equals(vo.getId()) && pw.equals(vo.getPw())) {
//				System.out.print("������ �����Ͻðڽ��ϱ�?(Y/N) ");
//				char yn = (char) sc.nextByte();
//				if (yn == 'Y' || yn == 'y') {
					lists.remove(vo);
					System.out.println("�����Ϸ�!");
					return;
//				} else {
//					System.out.println("���");
//					return;
//				}
			} else
				System.out.println("���̵� �Ǵ� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");

		}

	}

	@Override
	public void updata() {

		System.out.println(" <ȸ����������>");
		System.out.print("ID : ");
		id = sc.next();

		System.out.print("PW : ");
		pw = sc.next();

		Iterator<NaverVO> it = lists.iterator();
		while (it.hasNext()) {

			NaverVO vo = it.next();
			
			MyException auth = new MyException();
			
			if (id.equals(vo.getId()) && pw.equals(vo.getPw())) { // id, PW �Ѵ� ��ġ�ϴ��� Ȯ��

				while (true) {
					try {
						System.out.println("----------------------------------------------------------");
						System.out.println("              <������ �׸��� ������.>");
						System.out.println("1.PW 2.�̸� 3.���� 4.������� 5.E-Mail 6.��ȭ��ȣ 7.������");
						System.out.println("----------------------------------------------------------");
						System.out.print("> ");
						String set = sc.next();
						
						auth.inputformat(set);
						
						switch (set) {
						case "1":
							while (true) {
								System.out.print("������ PW : ");
								vo.setPw(sc.next());

								// PW ������ Ȯ��
								System.out.print("PW Ȯ�� : ");
								pw = sc.next();
								if (!pw.equals(vo.getPw())) {
									System.out.println("ó�� ��й�ȣ�� �ٸ��ϴ�.");
									continue;
								}
								break;
							}
							System.out.println("����Ϸ�!");
							continue;
						case "2":
							System.out.print("������ �̸� : ");
							vo.setName(sc.next());
							System.out.println("����Ϸ�!");
							continue;
						case "3":
							System.out.print("������ ���� : ");
							vo.setGender(sc.next());
							System.out.println("����Ϸ�!");
							continue;
						case "4":
							System.out.print("������ ������� : ");
							vo.setBirth(sc.next());
							System.out.println("����Ϸ�!");
							continue;
						case "5":
							System.out.print("������ E-Mail : ");
							vo.setEmail(sc.next());
							System.out.println("����Ϸ�!");
							continue;
						case "6":
							System.out.print("������ ��ȭ��ȣ : ");
							vo.setTel(sc.next());
							System.out.println("����Ϸ�!");
							continue;
						case "7":
							System.out.println("����ȭ������...");
							break;
						default:
							System.out.println("�߸��ԷµǾ����ϴ�.(1~7)");
							continue;
						}
					} catch (Exception e) {
						System.out.println("���ڸ� �Է� �����մϴ�.");
						continue;
					}
					
					return;
				}

			}

		}

	}

	@Override
	public void findId() {
		

		System.out.print("�˻��� ID�� �Է��ϼ���. : ");
		id = sc.next();

		System.out.print("\n�˻���");
		thread();
		System.out.println();
		
		Iterator<NaverVO> it = lists.iterator();
		while (it.hasNext()) {

			NaverVO vo = it.next();

			if (id.equals(vo.getId())) {
				System.out.println(vo.toString());
				return;
			} else if (!id.equals(vo.getId()))
				System.out.println("�߸��� ID�Դϴ�.");

		}

	}

	@Override
	public void findName() {

		System.out.print("�˻��� �̸��� �Է��ϼ���. : ");
		name = sc.next();
		
		System.out.print("\n�˻���");
		thread();
		System.out.println();
		Iterator<NaverVO> it = lists.iterator();
		while (it.hasNext()) {

			NaverVO vo = it.next();

			if (name.equals(vo.getName())) {
				System.out.println(vo.toString());
				return;
			} else if (!name.equals(vo.getName())) 
				System.out.println("�߸��� �̸��Դϴ�.");

		}

	}
	
	@Override
	public void saveInfo() {
		
		try {
			FileOutputStream fos = new FileOutputStream("d:\\doc\\people.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			
			while(lists != null) {
				oos.writeObject(lists);
			}
			
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
