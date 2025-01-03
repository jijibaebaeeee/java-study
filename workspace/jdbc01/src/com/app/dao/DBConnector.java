package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	public static Connection getConnection() {
		Connection connection = null; // connection 객체 생성

		// DB 연결에 필요한 정보
		// url은 정해져있는 것, URL 정확하게 작성해야함
		String url = "jdbc:oracle:thin:@localhost:1521:XE"; // 각각 DBMS에 따라 다름 구글링하면 다 나옴
		String userName = "test";
		String password = "1234";

		// 드라이버를 메모리에 할당하기 위한 과정
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(url, userName, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("연결 정보 오류");
		}
		
		return connection;
	}
}
