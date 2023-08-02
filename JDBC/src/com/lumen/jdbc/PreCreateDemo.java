package com.lumen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class PreCreateDemo {
public static void main(String[] args) {
	String Sql="create table employ(name varchar(20),employeeId int primary key,city varchar(20))";
	try (Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","admin@123");
			Statement statement=connection.createStatement();
			Scanner scanner=new Scanner(System.in);
		PreparedStatement preparedStatement=connection.prepareStatement(Sql)){
		preparedStatement.executeUpdate();
		System.out.println("Table created");

	}
		catch (Exception e) {
}
}
}
