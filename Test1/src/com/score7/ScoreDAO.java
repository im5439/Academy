package com.score7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;

public class ScoreDAO { // Data Access Object

	// �߰�
	public int insertData(ScoreDTO dto) {

		int result = 0;

		Connection conn = DBConn.getConnection();

		PreparedStatement pstmt = null;
		String sql;

		try {

			sql = "insert into score (hak,name,kor,eng,mat) values (?,?,?,?,?)";

			pstmt = conn.prepareStatement(sql); // �̸� �˻縦 �ؼ� pstmt�� ����

			pstmt.setString(1, dto.getHak());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getKor());
			pstmt.setInt(4, dto.getEng());
			pstmt.setInt(5, dto.getMat());

			result = pstmt.executeUpdate();

			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;

	}

	public List<ScoreDTO> getList() {

		List<ScoreDTO> lists = new ArrayList<ScoreDTO>();

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;

		try {

			sql = "select hak, name, kor, eng, mat, ";
			sql += "(kor+eng+mat) tot, (kor+eng+mat)/3 avg, rank() over (order by (kor+eng+mat) desc) rank from score";

			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

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

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return lists;

	}

	//����
	public int updateData(ScoreDTO dto) {

		int result = 0;

		Connection conn = DBConn.getConnection();

		PreparedStatement pstmt = null;
		String sql;

		try {

			sql = "update score set kor=?,eng=?,mat=? where hak=?";

			pstmt = conn.prepareStatement(sql); // �̸� �˻縦 �ؼ� pstmt�� ����

			pstmt.setInt(1, dto.getKor());	//sql�� ������� ���� ��
			pstmt.setInt(2, dto.getEng());
			pstmt.setInt(3, dto.getMat());
			pstmt.setString(4, dto.getHak());

			result = pstmt.executeUpdate();

			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;

	}
	
	
	public int deleteData(String hak) {
		
		int result = 0;
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		
		try {
			
			sql = "delete score where hak=?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, hak);
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return result;
		
	}
	
	public ScoreDTO searchData(String hak) {  // hak�� �ߺ����� �����Ƿ� list�� �Ƚᵵ ��.

		ScoreDTO dto = null; // hak�� �������� �ְ� �������� ������ �ʱⰪ null

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;

		try {

			sql = "select hak, name, kor, eng, mat, ";
			sql += "(kor+eng+mat) tot, (kor+eng+mat)/3 avg from score where hak=?"; // from score where name like ?"; like�� ���� ���

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, hak);    // like�� ���� ��� sql���� ?�� %�� ���̸� ������ �߰� pstmt.setString(1, name + "%"); �̷��� ����� �Ѵ�.
			
			rs = pstmt.executeQuery();

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

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return dto;

	}
	

}
