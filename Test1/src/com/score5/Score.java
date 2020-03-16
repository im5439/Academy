package com.score5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Score implements Runnable {
	
	ArrayList<ScoreVO> list = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	public void input() {
	
		ScoreVO vo = new ScoreVO();
		
		System.out.println();
		
		System.out.print("�̸�? ");
		vo.setName(sc.next());
		
		System.out.print("����? ");
		vo.setBirth(sc.next());
		
		System.out.print("����? ");
		vo.setScore(sc.nextInt());
		
		list.add(vo);
		System.out.println("�Է¿Ϸ�!!\n");
		
		if(list.size() > 10) {
			list.remove(0);
		}
		
	}
	
	public void print() {
		
		System.out.println();
		
		System.out.println("�Էµ� ��: " + list.size() + " (�ִ� 10��)");
		Iterator<ScoreVO> it = list.iterator();
		
		while(it.hasNext()) {
			
			ScoreVO vo = it.next();
			System.out.print(vo.toString());
			System.out.println();
			
		}
		System.out.println();
		
	}
	
	public void saveInfo() {
		
		try {
			
			FileOutputStream fos = new FileOutputStream("d:\\java\\work\\demo\\score.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
			
			oos.close();
			fos.close();
			
			System.out.print("������");
			thread();
			System.out.println("\n����Ϸ�!!");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void readInfo() {
		
		try {
			
			FileInputStream fis = new FileInputStream("d:\\java\\work\\demo\\score.txt");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			@SuppressWarnings("unchecked")
			ArrayList<ScoreVO> list2 = (ArrayList<ScoreVO>) ois.readObject();
			
//			Iterator<ScoreVO> it = list2.iterator();
//			while(it.hasNext()) {
//				
//				ScoreVO vo = it.next();
//				list.add(vo);
//				
//			}
			list.addAll(list2);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void run() {
		
		try {
			for(int i = 0; i < 5; i++) {
				System.out.print(".");
				Thread.sleep(100);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void thread() {
		
		Thread t = new Thread(new Score());
		t.start();
		try {
			t.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	
}
