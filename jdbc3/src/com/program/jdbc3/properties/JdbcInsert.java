package com.program.jdbc3.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcInsert {
	private static Connection connection;
	private static Statement statement;
	private static int i;
	private static Properties properties=new Properties();
	private static FileReader fileReader;
	
	public static void main(String[] args) {
		try {
			fileReader = new FileReader("F:\\MyPrograms\\jdbc3\\resources\\db_info.properties");
			properties.load(fileReader);
			
			Class.forName(properties.getProperty("com.mysql.cj.jdbc.Driver"));
			
			connection = DriverManager.getConnection(properties.getProperty("jdbc:mysql://localhost:3306/weje2?"),properties);
			
			statement = connection.createStatement();
			i = statement.executeUpdate("insert into student values(6, 'virat', 'virat@bcci', 1234567899)");
			
			System.out.println(i + "data insert successfully...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
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
