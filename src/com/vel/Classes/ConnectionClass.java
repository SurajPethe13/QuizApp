package com.vel.Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {


	public static Connection con = null;
	public Connection getConnectionDetails() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizapp", "root","root");

			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
		
		return con;
	}
	
	public void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] args) {
//		
//		ConnectionClass obj = new ConnectionClass();
//		Connection con = obj.getConnectionDetails();
//	}
	
}
