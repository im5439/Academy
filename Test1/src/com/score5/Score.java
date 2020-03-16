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
		
		System.out.print("이름? ");
		vo.setName(sc.next());
		
		System.out.print("생일? ");
		vo.setBirth(sc.next());
		
		System.out.print("점수? ");
		vo.setScore(sc.nextInt());
		
		list.add(vo);
		System.out.println("입력완료!!\n");
		
		if(list.size() > 10) {
			list.remove(0);
		}
		
	}
	
	public void print() {
		
		System.out.println();
		
		System.out.println("입력된 수: " + list.size() + " (최대 10명)");
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
			
			System.out.print("저장중");
			thread();
			System.out.println("\n저장완료!!");
			
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
