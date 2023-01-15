package com.program.jdbc2.crudoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsert {
	private static Connection connection;
	private static Statement statement;
	private static int i;
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2?","root","root");
			statement = connection.createStatement();
			i = statement.executeUpdate("insert into student values(3,'xyz','xyz@vgdhbfl',123456676)");
			System.out.println(i + "data insert successfully...");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (statement!=null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
