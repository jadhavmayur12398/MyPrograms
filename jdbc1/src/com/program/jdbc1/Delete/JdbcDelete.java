package com.program.jdbc1.Delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDelete {
	public static void main(String[] args) {
		try {
//			First way of connection - 
//			getConnection(String url)
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2?user=root&password=root");
			Statement statement = connection.createStatement();
			int i = statement.executeUpdate("delete from student where id=3");
			System.out.println(i + "data delete successfully");
			connection.close();
			statement.close();
		} catch (Exception e) {
		}
	}

}
