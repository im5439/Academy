package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

//JDBC : java DataBase Connectivity

public class DBConn {

	private static Connection dbConn;

	public static Connection getConnection() {

		if (dbConn == null) {

			try {
										// type4(thin) : IP : oracle�� �⺻��Ʈ(1521)
				String url = "jdbc:oracle:thin:@192.168.16.27:1521:TestDB";
				String user = "suzi";
				String password = "a123";

				Class.forName("oracle.jdbc.driver.OracleDriver"); // OracleDriver�� ��� ������ �о�´�.

				dbConn = DriverManager.getConnection(url, user, password); // Java�� DB�� �����ڸ� dbConn�� �־���´�.

			} catch (Exception e) {
				System.out.println(e.toString());
				// TODO: handle exception
			}

		}
		return dbConn;
	}
	
	// DB�� �ѹ�����ϸ� �ݾ���� �Ѵ�.
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
		// �ݱ⸸ �ϸ� �����Ⱚ�� �����. (���� ����� Adaptor ���� �߻���)
		// �׷��Ƿ� �ʱ�ȭ ������Ѵ�.
		dbConn = null;
		
		
		
	}

}
