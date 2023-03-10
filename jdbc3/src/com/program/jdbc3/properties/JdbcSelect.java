package com.program.jdbc3.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcSelect {
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static Properties properties= new Properties();
	private static FileReader fileReader;
	
	public static void main(String[] args) {
		try {
//			load Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			
			fileReader = new FileReader("F:\\MyPrograms\\jdbc3\\resources\\db_info.properties");
			
			properties.load(fileReader);
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2?",properties);
			
			statement = connection.createStatement();
			
			resultSet = statement.executeQuery("select * from student");
			
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + resultSet.getString(2) + resultSet.getString(3) + resultSet.getString(4));
			}
		} catch (ClassNotFoundException | FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
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
