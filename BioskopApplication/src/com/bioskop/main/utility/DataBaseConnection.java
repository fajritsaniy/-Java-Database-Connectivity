package com.bioskop.main.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {

	
	private static Connection con = null;
	
	private static String url ="jdbc:mysql://localhost:3306/databasefilm?useSSL=false";
	private static String user = "root";
	private static String password  = "";
	
	public static Connection getConnection() {
		
		if (con==null) {
			try {
				con = DriverManager.getConnection(url, user, password);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return con;
		
		
	}
}
