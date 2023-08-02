package com.lumen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class PreUpdateDemo {
public static void main(String[] args) {
	String Sql="update employ set city=? where employeeId=?";
	try (Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","admin@123");
			Statement statement=connection.createStatement();
			Scanner scanner=new Scanner(System.in);
		PreparedStatement preparedStatement=connection.prepareStatement(Sql)){
		while(true) {
//			String name=scanner.next();
			String city=scanner.next();

			int id=scanner.nextInt();
		preparedStatement.setString(1, city);
		preparedStatement.setInt(2, id);
//		preparedStatement.setString(3, city);
		preparedStatement.execute();
		System.out.println("Do you want to continue:[yes/no]");
		String option=scanner.next();
		if(option.equalsIgnoreCase("no"))
		{
			break;
		}
		}
		

	}
		catch (Exception e) {
}
}
}
