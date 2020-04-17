package com.score8;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;

import oracle.jdbc.OracleTypes;

public class ScoreDAO { // Data Access Object

	// 추가
	public int insertData(ScoreDTO dto) {

		int result = 0;

		Connection conn = DBConn.getConnection();

		CallableStatement cstmt = null;  // CallableStatement 프로시저 실행하는
		String sql;

		try {

			sql = "{call insertScore(?,?,?,?,?)}";

			cstmt = conn.prepareCall(sql); // 미리 검사를 해서 pstmt에 넣음

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

			sql = "{call selectAllScore(?)}";  // ?에서 나오는값을 받아냄

			cstmt = conn.prepareCall(sql);
			
			//out파라미터 자료형
			cstmt.registerOutParameter(1, OracleTypes.CURSOR); // OracleType 프로젝트폴더 우클릭하고 Build Path -> Configure Build Path -> Libraries -> add_External_JARs 에서 ojdbc6.jar 
			
			//프로시저 실행
			cstmt.executeUpdate(); // ? 에서 데이터가 나옴
			
			//out파라미터의 값을 받는다
			rs = (ResultSet)cstmt.getObject(1);

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
			
			rs.close();
			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return lists;

	}

	//수정
	public int updateData(ScoreDTO dto) {

		int result = 0;

		Connection conn = DBConn.getConnection();

		CallableStatement cstmt = null;
		String sql;

		try {

			sql = "{call updateScore(?,?,?,?)}";

			cstmt = conn.prepareCall(sql); // 미리 검사를 해서 pstmt에 넣음

			cstmt.setString(1, dto.getHak());
			cstmt.setInt(2, dto.getKor());	//프로시저에 있는 컬럼 순서대로 들어가야 함
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
	
	public ScoreDTO searchData(String hak) {  // hak은 중복값이 없으므로 list를 안써도 됨.

		ScoreDTO dto = null; // hak이 있을수도 있고 없을수도 있으니 초기값 null

		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		ResultSet rs = null;
		String sql;

		try {

			sql = "{call selectHakScore(?,?)}";

			cstmt = conn.prepareCall(sql);

			//out파라미터 자료형 선언
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			
			//in파라미터 자료형 선언
			cstmt.setString(2, hak);
			
			//프로시저 실행
			cstmt.executeUpdate();
			
			rs = (ResultSet)cstmt.getObject(1); // ? 첫번째것이 반환값
			
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
			
			rs.close();
			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return dto;

	}
	

}
