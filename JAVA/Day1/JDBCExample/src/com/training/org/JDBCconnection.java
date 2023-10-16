package com.training.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCconnection {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/library";
		String username = "root";
		String password = "1234";
		Connection con  = null;
		try {
			con  = DriverManager.getConnection(url, username, password);
			if(con!=null) {
				System.out.println("connection is succesfull...");
			}
			else {
				System.out.println("not able to connect");
			}
		}
		catch (Exception e) {
			System.out.println("Error"+e.getMessage());
		}
		finally {
			if(con!=null) {
				con.close();
				System.out.println("connection closed");
			}
			else {
				System.out.println("cant able to close the connection!");
			}
			
		}
		
	}

}
