package com.dbTest;

import java.sql.Connection;
import java.sql.Statement;

import com.db.DBConn;

//DB를 연결하는 방법
//SQL구문을 실행하는 인터페이스
//1.Statement           -기본
//2.PreparedStatement   -가장많이씀
//3.CallableStatement   -프로시저와 연결할때 사용

//DB연결 순서
// 1.DriverManager가 Connection을 생성
// 2.Connection이 Statement를 생성
// 3.Statement가 query를 실행

public class Test2 {

	public static void main(String[] args) {
		
		// 1.DriverManager가 Connection을 생성
		Connection conn = DBConn.getConnection();
		
		if(conn == null) {
			System.out.println("데이터베이스 연결 실패!!");
			System.exit(0);
		}
		
		try {
			
			// 2.Connection이 Statement를 생성
			Statement stmt = conn.createStatement();
			
			String sql;
			/*
			//insert 
			sql = "insert into score (hak,name,kor,eng,mat) "; 
			sql += "values ('111','배수지',60,70,90)";

			
			// 3.Statement가 query를 실행
			int result = stmt.executeUpdate(sql); // insert, update, delete 실행하는건 무조건 Update  /  select는 excutequery
			
			if (result == 1) {
				System.out.println("추가 성공!!");
			}
			// result = 0 실패, 1 성공
			*/
			
			/*
			//update
			sql = "update score set name='유인나', kor=90, eng=90, mat=90 where hak = '111'";
			
			int result = stmt.executeUpdate(sql);
			
			if (result == 1) {
				System.out.println("수정 성공!!");
			}
			*/
			
			//delete
			sql = "delete from score where hak='111'";
			
			int result = stmt.executeUpdate(sql);
			
			if (result == 1) {
				System.out.println("삭제 성공!!");
			}
			
			
            // 언어에서 DB에 들어가는 데이터는 항상 Commit
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		DBConn.close();  // DB를 닫아준다.
		
		
	}

}
