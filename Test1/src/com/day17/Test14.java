package com.day17;

import java.io.File;
import java.io.FileFilter;

//FileFilter 인터페이스

class MyFilterList implements FileFilter{
	
	private File f;
	
	public MyFilterList(String filePath) {
		f = new File(filePath);
		
	}
	
	public void result() {
		
		try {
			
			if(!f.exists()) {
				System.out.println("파일이 존재하지 않습니다");
				return;
			}
			
			System.out.println("절대경로: " + f.getAbsolutePath());
			System.out.println("파일 크기: " + f.length());
			
			//폴더인경우
			if(f.isDirectory()) {
				
				File[] lists = f.listFiles(this);
				System.out.println("\n폴더의 내용...");
				for(int i = 0 ;i<lists.length;i++) {
					System.out.print(lists[i].getName());
					System.out.println("\t" + lists[i].length());
				}
			}
			
			//디렉토리의 구조(C:,D:)
			System.out.println("디렉토리의 구조...");
			File[] root = File.listRoots();
			for(int i=0;i<root.length;i++) {
				System.out.println(root[i].getPath());
			}
			
		
		} catch (Exception e) {
			
		}
		
		
		
	}

	@Override
	public boolean accept(File pathname) {
		return pathname.isFile() || pathname.isDirectory();
		//return pathname.isFile();
		//return pathname.isDirectory();
	}
}


public class Test14 {

	public static void main(String[] args) {
		
		MyFilterList mf = new MyFilterList("c:\\windows");
		mf.result();
	}

}
