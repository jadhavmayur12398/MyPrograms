package com.program.jdbc1.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcUpdate {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2?user=root&password=root");
			Statement statement = connection.createStatement();
			int i  = statement.executeUpdate("update student set contact=9876543222 where id=3");
			System.out.println(i + "data updated successfully...");
			connection.close();
			statement.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
