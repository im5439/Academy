package com.day17;

import java.io.File;
import java.io.IOException;
import java.util.Date;

//File
//파일 및 폴더를 관리할 수 있도록 기능을 제공해주는 클래스
//파일에 복사 또는 이름변경 등의 조작을 할 경우에만 사용되고
//파일의 내용을 입출력 하는 기능은 없다


public class Test12 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("d:\\doc\\test.txt");
		
		System.out.println("파일명: " + f.getName());
		System.out.println("파일크기: " + f.length());
		System.out.println("파일절대경로: " + f.getAbsolutePath());//절대경로
		System.out.println("파일표준경로: " + f.getCanonicalPath());
		System.out.println("파일생성일: " + new Date(f.lastModified()));//마지막 변경일
		System.out.println("파일상위경로: " + f.getParent()); 
		System.out.println("읽기속성: " + f.canRead());
		System.out.println("쓰기속성: " + f.canWrite());
		
		//현재 작업경로
		String path = System.getProperty("user.dir");
		System.out.println("현재 작업경로: " + path);
		
		
		

	}

}
