package com.lumen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class PreInsertDemo {
public static void main(String[] args) {
	String Sql="insert into employ values(?,?,?)";
	try (Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","admin@123");
			Statement statement=connection.createStatement();
			Scanner scanner=new Scanner(System.in);
		PreparedStatement preparedStatement=connection.prepareStatement(Sql)){
		preparedStatement.setString(1, "Java");
		preparedStatement.setInt(2, 1);
		preparedStatement.setString(3, "kadiri");
		preparedStatement.execute();
		System.out.println("One ROw Inserted ");

	}
		catch (Exception e) {
}
}
}
