package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
}
