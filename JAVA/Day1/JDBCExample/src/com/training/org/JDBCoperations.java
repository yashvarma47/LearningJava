package com.training.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCoperations {

	private Connection con;
	private String username;
	private String password;
	private String query;
	private Statement stmt;

	public JDBCoperations() throws SQLException {
		System.out.println("default consstuctor is called");
		con = null;
		username ="";
		password = "";
		query = "";
		//stmt = con.createStatement();
	}
	public static Connection mysqlConnection(String username, String password) throws SQLException  {
		Connection con = null;

		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1jdbc",username,password);
		return con;
	}
	public JDBCoperations(String username,String password) throws SQLException {
		System.out.println("Parameterised constructor of JDBCOperations is called");
		this.username=username;
		this.password=password;
		con=JDBCoperations.mysqlConnection(username, password);
		stmt=con.createStatement();
		query="";
	}
	public void createDatabase(String name) throws SQLException {
		//Statement stmt = con.createStatement();
		String query = "create database "+name;
		stmt.executeUpdate(query);
		System.out.println("Database created!");
	}
	public void createTable (String Table) throws SQLException {
		//Statement stmt = con.createStatement();
		System.out.println(stmt.executeUpdate(Table));
		System.out.println("Table is created!");
	}
	
	// Method to show Database
	public void ShowDatabase() throws SQLException {
		ResultSet resultSet = null;
        Statement stmt = con.createStatement();
        String sql = "SHOW DATABASEs";
        resultSet = stmt.executeQuery(sql);
        while (resultSet.next()) {
            String databaseName = resultSet.getString(1);
            System.out.println("Database Names: " + databaseName);
        }
    }
	
	public void insertdata() throws SQLException {
		stmt.execute("insert into Employee values (101,'yash',50000);");
		stmt.execute("insert into Employee values (102,'vipul',60000);");
		stmt.execute("insert into Employee values (103,'madhukar',70000);");
		System.out.println("Record added!");
	}
	public void insertData() throws SQLException {
	PreparedStatement pst = con.prepareStatement("insert into Employee values(?,?,?)");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Employee ID: ");
	int id = sc.nextInt();
	System.out.println("Enter Employee Name: ");

	String name = sc.next();
	System.out.println("Enter Employee Salary: ");

	int salary = sc.nextInt();
	pst.setInt(1, id);
	pst.setString(2, name);
	pst.setInt(3, salary);
	pst.executeUpdate( );

	System.out.println(name + " Record is inserted");


	
	}
	

}
