package com.lumen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSet {
//	static 
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/mysql";
		String username="root";
		String password="admin@123";
		String query="select * from employee";
		try (Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","admin@123");
			Statement statement=connection.createStatement();
			java.sql.ResultSet resultSet=statement.executeQuery("select *from employee")){
			

			while(resultSet.next()) {
				System.out.println(resultSet.getString("name")+" "+resultSet.getInt("employeeId")+" "+resultSet.getString("city"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
