package com.dbTest;

import java.sql.Connection;
import java.sql.Statement;

import com.db.DBConn;

//DB�� �����ϴ� ���
//SQL������ �����ϴ� �������̽�
//1.Statement           -�⺻
//2.PreparedStatement   -���帹�̾�
//3.CallableStatement   -���ν����� �����Ҷ� ���

//DB���� ����
// 1.DriverManager�� Connection�� ����
// 2.Connection�� Statement�� ����
// 3.Statement�� query�� ����

public class Test2 {

	public static void main(String[] args) {
		
		// 1.DriverManager�� Connection�� ����
		Connection conn = DBConn.getConnection();
		
		if(conn == null) {
			System.out.println("�����ͺ��̽� ���� ����!!");
			System.exit(0);
		}
		
		try {
			
			// 2.Connection�� Statement�� ����
			Statement stmt = conn.createStatement();
			
			String sql;
			/*
			//insert 
			sql = "insert into score (hak,name,kor,eng,mat) "; 
			sql += "values ('111','�����',60,70,90)";

			
			// 3.Statement�� query�� ����
			int result = stmt.executeUpdate(sql); // insert, update, delete �����ϴ°� ������ Update  /  select�� excutequery
			
			if (result == 1) {
				System.out.println("�߰� ����!!");
			}
			// result = 0 ����, 1 ����
			*/
			
			/*
			//update
			sql = "update score set name='���γ�', kor=90, eng=90, mat=90 where hak = '111'";
			
			int result = stmt.executeUpdate(sql);
			
			if (result == 1) {
				System.out.println("���� ����!!");
			}
			*/
			
			//delete
			sql = "delete from score where hak='111'";
			
			int result = stmt.executeUpdate(sql);
			
			if (result == 1) {
				System.out.println("���� ����!!");
			}
			
			
            // ���� DB�� ���� �����ʹ� �׻� Commit
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		DBConn.close();  // DB�� �ݾ��ش�.
		
		
	}

}
