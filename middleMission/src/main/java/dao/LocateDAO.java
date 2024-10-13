package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.JDBCConnect;
import common.RDSConnectionTest;
import dto.LocateDTO;

public class LocateDAO {
	// 위치 가져오기 버튼 클릭 시 위치 정보 테이블에 데이터 삽입
	public void insertLocate(LocateDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;  

		try {
			// conn
			conn = JDBCConnect.getConnection();

			// sql + 쿼리창
			String sql = "insert into locate(xPosition, yPosition) values(?, ?)";
			pstmt = conn.prepareStatement(sql);

			// ?에 들어갈 컬럼들 세팅
			pstmt.setLong(1, (long) dto.getxPosition());
			pstmt.setLong(2, (long) dto.getyPosition());

			// execute 실행
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 위치 조회 목록 전체보기
	public List<LocateDTO> selectList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;				

		List<LocateDTO> dtos = new ArrayList<LocateDTO>();
		//sql
		String sql = "select idx, xPosition, yPosition, selectDate from locate order by idx desc";

		try {
			conn = JDBCConnect.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while(rs.next()) {
				int idx = rs.getInt("idx");
				double xPosition = rs.getDouble("xPosition");
				double yPosition = rs.getDouble("yPosition");
				String selectDate = rs.getString("selectDate");
				
				LocateDTO dto = new LocateDTO(idx, xPosition, yPosition, selectDate);
				dtos.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCConnect.close(rs, pstmt, conn);
		}
		return dtos;
	}
}
