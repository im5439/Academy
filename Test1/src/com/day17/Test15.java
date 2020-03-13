package com.day17;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

//RandomAccessFile
//일반적인 파일은 순차적으로 데이터를 읽음
//RandomAccessFile 원하는 곳으로 이동해서 읽기가 가능

public class Test15 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		File f = File.createTempFile("imsi", ".tmp");
		f.deleteOnExit();
		
		FileOutputStream fos = new FileOutputStream(f);
		
		for(int i=0;i<100;i++) {
			fos.write(i);
		}
		
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		
		raf.seek(30);//30번째 데이터를 출력
		System.out.println("seek(30): " + raf.readByte());
		
		for(int i=0;i<100;i++) {
			raf.seek(i);
			System.out.println(raf.readByte());
		}
		
		raf.close();
	}

}
