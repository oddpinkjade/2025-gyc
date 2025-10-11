package hw_251002;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    // TODO: 환경 변수 파일 분리
    private static final String URL = "jdbc:oracle:thin:@//localhost:1521/FREE";
    private static final String USER_NAME = "C##osaka";
    private static final String USER_PASSWORD = "1234";

    private DBUtil() {}

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD);
        } catch (SQLException e) {
            //System.out.println("DB 연결 실패: " + e.getMessage());
            throw new IllegalStateException(e);
        }
        // return null;
    }
}
