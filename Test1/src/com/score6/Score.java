package com.score6;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.db.DBConn;

public class Score {

	Scanner sc = new Scanner(System.in);

	// 1.�Է�
	public int insertData() {

		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		String sql;

		int result = 0;

		try {

			ScoreDTO dto = new ScoreDTO();

			System.out.print("�й�? ");
			dto.setHak(sc.next());

			System.out.print("�̸�? ");
			dto.setName(sc.next());

			System.out.print("��������? ");
			dto.setKor(sc.nextInt());

			System.out.print("��������? ");
			dto.setEng(sc.nextInt());

			System.out.print("��������? ");
			dto.setMat(sc.nextInt());

			sql = "insert into score (hak, name, kor, eng, mat) values ('" + dto.getHak() + "','" + dto.getName() + "',"
					+ dto.getKor() + "," + dto.getEng() + "," + dto.getMat() + ")"; // score(�÷�,) �÷��� �� ����� �Ѵ�.(�˾ƺ���
																					// �����ϱ�����)

			stmt = conn.createStatement();

			result = stmt.executeUpdate(sql);

			stmt.close();

			System.out.println("�Է� �Ϸ�!");

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;

	}

	// 2.����
	public int updateData() {

		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		String sql;

		int result = 0;

		try {

			ScoreDTO dto = new ScoreDTO();

			System.out.print("�й�? ");
			dto.setHak(sc.next());

			System.out.print("��������? ");
			dto.setKor(sc.nextInt());

			System.out.print("��������? ");
			dto.setEng(sc.nextInt());

			System.out.print("��������? ");
			dto.setMat(sc.nextInt());

			sql = "update score set kor = " + dto.getKor() + ", eng =" + dto.getEng() + ", mat =" + dto.getMat()
					+ " where hak='" + dto.getHak() + "'";

			stmt = conn.createStatement();

			result = stmt.executeUpdate(sql);

			stmt.close();

			System.out.println("���� �Ϸ�!");

		} catch (Exception e) {
			// TODO: handle exception
		}

		return result;

	}

	// 3.����
	public int deleteData() {

		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		String sql;

		int result = 0;

		try {
			String hak;
			System.out.print("������ �й�? ");
			hak = sc.next();

			sql = "delete score where hak = '" + hak + "'";

			stmt = conn.createStatement();

			result = stmt.executeUpdate(sql);

			stmt.close();

		} catch (SQLException e) {
			System.out.println(e.toString());
		}

		return result;

	}

	// 4.��ü���
	public void selectAll() {

		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		ResultSet rs = null; // ResultSet : select�� ���̺��� �޾Ƴ��� �������̽�
		String sql;

		try {

			sql = "select hak,name,kor,eng,mat,(kor+eng+mat) tot,(kor+eng+mat)/3 avg from score order by hak";

			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);
			
			System.out.printf("%4s %6s %4s %4s %4s %4s %4s\n", "hak","name","kor","eng","mat","tot","avg");
			System.out.println("-------------------------------------");
			
			
			while (rs.next()) { // rs�� �����Ͱ� ����������

				ScoreDTO dto = new ScoreDTO();

				dto.setHak(rs.getString(1)); // index ��ȣ
				dto.setName(rs.getString("name")); // �÷��� �ᵵ �ȴ�.
				dto.setKor(rs.getInt(3));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt(5));
				dto.setTot(rs.getInt("tot"));
				dto.setAvg(rs.getInt(7));

				System.out.printf("%4s %6s %4d %4d %4d %4d %4d\n", dto.getHak(), dto.getName(), dto.getKor(),
						dto.getEng(), dto.getMat(), dto.getTot(), dto.getAvg());

			}

			rs.close();
			stmt.close();
			System.out.println();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	// 5.�̸����
	public void nameSearch() {

		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql;

		try {
			String name;
			System.out.print("�˻��� �̸�? ");
			name = sc.next();

			sql = "select hak,name,kor,eng,mat,(kor+eng+mat) tot,(kor+eng+mat)/3 avg from score where name like'%" + name + "%' order by hak";

			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);

			System.out.printf("%4s %6s %4s %4s %4s %4s %4s\n", "hak","name","kor","eng","mat","tot","avg");
			System.out.println("-------------------------------------");
			
			while (rs.next()) {

				ScoreDTO dto = new ScoreDTO();

				dto.setHak(rs.getString("hak"));
				dto.setName(rs.getString("name"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setTot(rs.getInt("tot"));
				dto.setAvg(rs.getInt("avg"));

				System.out.printf("%4s %6s %4d %4d %4d %4d %4d\n", dto.getHak(), dto.getName(), dto.getKor(),
						dto.getEng(), dto.getMat(), dto.getTot(), dto.getAvg());

			}

			rs.close();
			stmt.close();

			System.out.println();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
}
