package com.program.jdbc1.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcInsert {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2?user=root&password=root");
			Statement statement = connection.createStatement();
			int i = statement.executeUpdate("insert into student values(3,'mahesh','mahesh@qsp',12345)");
			System.out.println(i + "data inserted successfully...");
			connection.close();
			statement.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
