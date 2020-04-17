package com.dbTest;

import java.sql.Connection;

import com.db.DBConn;

public class Test1 {

	public static void main(String[] args) {

		Connection conn = DBConn.getConnection();

		if (conn == null) {
			System.out.println("DB Connection Error!!");
			System.exit(0);
		}
		
		System.out.println("DB Connection Success!!");
		
		//conn.close(); -- X
		DBConn.close();
		

	}

}
