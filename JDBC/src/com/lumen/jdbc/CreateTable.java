package com.lumen.jdbc;


import java.sql.*;

public class CreateTable {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/mysql";
		String username="root";
		String password="admin@123";
		String query="create table employee(name varchar(20),employeeId int primary key,city varchar(20));";
		try {
			Connection connection= DriverManager.getConnection(url,username,password);

			Statement statement=connection.createStatement();

//			boolean result=statement.execute(query);
			java.sql.ResultSet resultSet=statement.executeQuery(query);

			while(resultSet.next()) {
				System.out.println(resultSet.getString("name")+" "+resultSet.getInt("employeeId")+" "+resultSet.getString("city"));
			}
			System.out.println("Table Created");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
