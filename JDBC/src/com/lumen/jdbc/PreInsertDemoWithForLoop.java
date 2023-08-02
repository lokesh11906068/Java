package com.lumen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class PreInsertDemoWithForLoop {
public static void main(String[] args) {
	String Sql="insert into employ values(?,?,?)";
	try (Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","admin@123");
			Statement statement=connection.createStatement();
			Scanner scanner=new Scanner(System.in);
		PreparedStatement preparedStatement=connection.prepareStatement(Sql)){
		while(true) {
			String name=scanner.next();
			int id=scanner.nextInt();
			String city=scanner.next();
		preparedStatement.setString(1, name);
		preparedStatement.setInt(2, id);
		preparedStatement.setString(3, city);
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
