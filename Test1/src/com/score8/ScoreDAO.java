package com.score8;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;

import oracle.jdbc.OracleTypes;

public class ScoreDAO { // Data Access Object

	// �߰�
	public int insertData(ScoreDTO dto) {

		int result = 0;

		Connection conn = DBConn.getConnection();

		CallableStatement cstmt = null;  // CallableStatement ���ν��� �����ϴ�
		String sql;

		try {

			sql = "{call insertScore(?,?,?,?,?)}";

			cstmt = conn.prepareCall(sql); // �̸� �˻縦 �ؼ� pstmt�� ����

			cstmt.setString(1, dto.getHak());
			cstmt.setString(2, dto.getName());
			cstmt.setInt(3, dto.getKor());
			cstmt.setInt(4, dto.getEng());
			cstmt.setInt(5, dto.getMat());

			result = cstmt.executeUpdate();

			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;

	}

	public List<ScoreDTO> getList() {

		List<ScoreDTO> lists = new ArrayList<ScoreDTO>();

		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		ResultSet rs = null;
		String sql;

		try {

			sql = "{call selectAllScore(?)}";  // ?���� �����°��� �޾Ƴ�

			cstmt = conn.prepareCall(sql);
			
			//out�Ķ���� �ڷ���
			cstmt.registerOutParameter(1, OracleTypes.CURSOR); // OracleType ������Ʈ���� ��Ŭ���ϰ� Build Path -> Configure Build Path -> Libraries -> add_External_JARs ���� ojdbc6.jar 
			
			//���ν��� ����
			cstmt.executeUpdate(); // ? ���� �����Ͱ� ����
			
			//out�Ķ������ ���� �޴´�
			rs = (ResultSet)cstmt.getObject(1);

			while (rs.next()) {

				ScoreDTO dto = new ScoreDTO(); // �ݵ�� while�� �ȿ� �־����. �ۿ� ������ ������ ���� ����ȴ�.

				dto.setHak(rs.getString("hak"));
				dto.setName(rs.getString("name"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setTot(rs.getInt("tot"));
				dto.setAvg(rs.getInt("avg"));
				dto.setRank(rs.getInt("rank"));

				lists.add(dto);

			}
			
			rs.close();
			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return lists;

	}

	//����
	public int updateData(ScoreDTO dto) {

		int result = 0;

		Connection conn = DBConn.getConnection();

		CallableStatement cstmt = null;
		String sql;

		try {

			sql = "{call updateScore(?,?,?,?)}";

			cstmt = conn.prepareCall(sql); // �̸� �˻縦 �ؼ� pstmt�� ����

			cstmt.setString(1, dto.getHak());
			cstmt.setInt(2, dto.getKor());	//���ν����� �ִ� �÷� ������� ���� ��
			cstmt.setInt(3, dto.getEng());
			cstmt.setInt(4, dto.getMat());

			result = cstmt.executeUpdate();

			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;

	}
	
	
	public int deleteData(String hak) {
		
		int result = 0;
		
		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		String sql;
		
		try {
			
			sql = "{call deleteScore(?)}";
			
			cstmt = conn.prepareCall(sql);
			
			cstmt.setString(1, hak);
			
			result = cstmt.executeUpdate();
			
			cstmt.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return result;
		
	}
	
	public ScoreDTO searchData(String hak) {  // hak�� �ߺ����� �����Ƿ� list�� �Ƚᵵ ��.

		ScoreDTO dto = null; // hak�� �������� �ְ� �������� ������ �ʱⰪ null

		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		ResultSet rs = null;
		String sql;

		try {

			sql = "{call selectHakScore(?,?)}";

			cstmt = conn.prepareCall(sql);

			//out�Ķ���� �ڷ��� ����
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			
			//in�Ķ���� �ڷ��� ����
			cstmt.setString(2, hak);
			
			//���ν��� ����
			cstmt.executeUpdate();
			
			rs = (ResultSet)cstmt.getObject(1); // ? ù��°���� ��ȯ��
			
			if (rs.next()) {

				dto = new ScoreDTO(); // dto�� ������ ��ü����

				dto.setHak(rs.getString("hak"));
				dto.setName(rs.getString("name"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setTot(rs.getInt("tot"));
				dto.setAvg(rs.getInt("avg"));

			}
			
			rs.close();
			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return dto;

	}
	

}
