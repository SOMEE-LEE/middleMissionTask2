package common;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCConnect {
    private static BasicDataSource dataSource;

    static {
        // 데이터베이스 연결 정보 설정
        dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://middlemission-db.cr4m6yw6mfnv.ap-northeast-2.rds.amazonaws.com/middleMission");
        dataSource.setUsername("admin");
        dataSource.setPassword("Dream970307!");
        dataSource.setInitialSize(10); // 초기 연결 개수
        dataSource.setMaxTotal(10); // 최대 활성화 가능한 커넥션 개수 설정
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(PreparedStatement pstmt, Connection conn) {
        try {
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}