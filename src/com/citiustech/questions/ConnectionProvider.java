package com.citiustech.questions;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	
	static Connection con;
	
	public static Connection createConnection(){
		try{
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			String user="root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/exammanagement";
			
			//create the connection
			con= DriverManager.getConnection(url,user,password);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
}
