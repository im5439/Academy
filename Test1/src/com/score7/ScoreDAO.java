package com.score7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;

public class ScoreDAO { // Data Access Object

	// 추가
	public int insertData(ScoreDTO dto) {

		int result = 0;

		Connection conn = DBConn.getConnection();

		PreparedStatement pstmt = null;
		String sql;

		try {

			sql = "insert into score (hak,name,kor,eng,mat) values (?,?,?,?,?)";

			pstmt = conn.prepareStatement(sql); // 미리 검사를 해서 pstmt에 넣음

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

				ScoreDTO dto = new ScoreDTO(); // 반드시 while문 안에 있어야함. 밖에 있으면 마지막 값만 저장된다.

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

	//수정
	public int updateData(ScoreDTO dto) {

		int result = 0;

		Connection conn = DBConn.getConnection();

		PreparedStatement pstmt = null;
		String sql;

		try {

			sql = "update score set kor=?,eng=?,mat=? where hak=?";

			pstmt = conn.prepareStatement(sql); // 미리 검사를 해서 pstmt에 넣음

			pstmt.setInt(1, dto.getKor());	//sql문 순서대로 들어가야 함
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
	
	public ScoreDTO searchData(String hak) {  // hak은 중복값이 없으므로 list를 안써도 됨.

		ScoreDTO dto = null; // hak이 있을수도 있고 없을수도 있으니 초기값 null

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;

		try {

			sql = "select hak, name, kor, eng, mat, ";
			sql += "(kor+eng+mat) tot, (kor+eng+mat)/3 avg from score where hak=?"; // from score where name like ?"; like를 썼을 경우

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, hak);    // like를 썼을 경우 sql문의 ?에 %를 붙이면 에러가 뜨고 pstmt.setString(1, name + "%"); 이렇게 써줘야 한다.
			
			rs = pstmt.executeQuery();

			if (rs.next()) {

				dto = new ScoreDTO(); // dto에 있으면 객체생성

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
