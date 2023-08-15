package com.rhythumitra.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnection {
	static Connection connection;
	public static Connection opeConnection() {
		String url="jdbc:mysql://localhost:3306/mysql";
		String username="root";
		String password="admin@123";
//		String sql=Queries.createquery;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url,username,password);
		
//				Statement statement = connection.createStatement();		
//				statement.execute(sql);
//				System.out.println("Connection Succeded");
				
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return connection;
	}

}