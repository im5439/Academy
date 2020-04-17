package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

//JDBC : java DataBase Connectivity

public class DBConn {

	private static Connection dbConn;

	public static Connection getConnection() {

		if (dbConn == null) {

			try {
										// type4(thin) : IP : oracle의 기본포트(1521)
				String url = "jdbc:oracle:thin:@192.168.16.27:1521:TestDB";
				String user = "suzi";
				String password = "a123";

				Class.forName("oracle.jdbc.driver.OracleDriver"); // OracleDriver의 모든 정보를 읽어온다.

				dbConn = DriverManager.getConnection(url, user, password); // Java와 DB의 연결자를 dbConn에 넣어놓는다.

			} catch (Exception e) {
				System.out.println(e.toString());
				// TODO: handle exception
			}

		}
		return dbConn;
	}
	
	// DB는 한번사용하면 닫아줘야 한다.
	public static void close() {
		
		if(dbConn != null) {
			
			try {
				
				if(!dbConn.isClosed()) {
					dbConn.close();
				}
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		
		}
		// 닫기만 하면 쓰래기값이 생긴다. (다음 실행시 Adaptor 오류 발생함)
		// 그러므로 초기화 해줘야한다.
		dbConn = null;
		
		
		
	}

}
