package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDBConnectionUtil {
	private static String JDBC_CONNECTION_URL = "jdbc:oracle:thin:@localhost:1521:xe";

	public static Connection getCon() {
		Connection connection = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(JDBC_CONNECTION_URL,"system","theme123");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}
}
