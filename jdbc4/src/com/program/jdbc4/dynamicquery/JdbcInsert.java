package com.program.jdbc4.dynamicquery;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcInsert {
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static int i;
	private static Properties properties = new Properties();
	private static FileReader fileReader;
	private static String filPath="F:\\MyPrograms\\jdbc4\\resources\\db_info.properties";
	private static String query;
	
	public static void main(String[] args) {
		try {
			fileReader = new FileReader(filPath);
			properties.load(fileReader);
			
			Class.forName(properties.getProperty("driverpath"));
			
			connection = DriverManager.getConnection(properties.getProperty("dburl"), properties);
			
			query = "insert into student values(?,?,?,?)";
			
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, 9);
			preparedStatement.setString(2, "xyz");
			preparedStatement.setString(3, "xyz@gmail.com");
			preparedStatement.setString(4, "9876655");
			
			i = preparedStatement.executeUpdate();
			
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
			if (preparedStatement!=null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
