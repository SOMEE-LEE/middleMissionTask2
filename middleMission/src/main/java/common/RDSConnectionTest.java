package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RDSConnectionTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://middlemission-db.cr4m6yw6mfnv.ap-northeast-2.rds.amazonaws.com/middleMission"; // RDS 엔드포인트, 포트, 데이터베이스 이름
        String user = "admin"; // RDS 사용자 이름
        String password = "Dream970307!"; // RDS 비밀번호

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn != null) {
                System.out.println("RDS 연결 성공!");
            }
        } catch (SQLException e) {
            System.out.println("연결 실패: " + e.getMessage());
        }
    }
}