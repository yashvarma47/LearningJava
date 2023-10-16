package com.training.org;

import java.sql.SQLException;

public class DatabaseConnection {

	public static void main(String[] args) throws SQLException {
		try {
		JDBCoperations jb=new JDBCoperations("root","1234");
//		jb.createDatabase("Test1jdbc");
		//jb.createTable("create table Employee(empid int, name varchar(30), salary int)");
		//jb.showdatabase("show databases ");
		//jb.insertdata();
		jb.insertData();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
