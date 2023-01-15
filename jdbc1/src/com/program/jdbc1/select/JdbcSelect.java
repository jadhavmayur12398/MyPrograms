package com.program.jdbc1.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcSelect {
	public static void main(String[] args) {
		try {
//			Load the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			Open Connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2?user=root&password=root");
			
//			Create Statement
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from student");
			
//			Process the result
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1) + resultSet.getString(2) + resultSet.getString(3));
				
//				Close Connections
				connection.close();
				statement.close();
				resultSet.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
