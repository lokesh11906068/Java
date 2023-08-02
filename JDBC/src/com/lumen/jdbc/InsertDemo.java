package com.lumen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDemo {
//	static 
	public static void main(String[] args) {
		//		String name;
		try (Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","admin@123");
			Statement statement=connection.createStatement();
			Scanner scanner=new Scanner(System.in)){
				
				for(int i=0;i<4;i++) {
			System.out.println("Enter Name:");
			String name=scanner.nextLine();
			System.out.println("Enter Employee Id:");
			int employeeId=scanner.nextInt();
			System.out.println("Enter City:");
			String city=scanner.nextLine();
			String query="insert into employee('"+name+"',"+employeeId+",'"+city+"')";
			int res=statement.executeUpdate(query);
			System.out.println("Inserted:"+res);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		} 
	}


