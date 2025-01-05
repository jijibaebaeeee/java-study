package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO1 {
	public Connection connection;
	public PreparedStatement preparedStatement;
	public ResultSet resultSet;
	
	public boolean checkId(String userId) { // true -> 중복 x
		String query = "SELECT USER_ID FROM USER_TBL WHERE USER_ID = ?";
		
		try {
			connection = DBConnector.getConnection();
			
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, userId);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) { // 중복이면
				return false; // false 반환
			}
		} catch (SQLException e) {
			System.out.println("checkId() 메소드 sql오류");
		} finally {
			try {
				if(resultSet != null) { // 존재한다면
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return true;
	}
}
