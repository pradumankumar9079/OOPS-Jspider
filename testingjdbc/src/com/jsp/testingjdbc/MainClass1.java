package com.jsp.testingjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass1 {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		String qry = "insert into test.testing values(103,'Riya')";
		String qry2 = "select * from test.testing";
		try {
			// Load and Register
			Class.forName("com.mysql.jdbc.Driver");

			// Connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=");
			System.out.println("Connection Established");

			// Creating Statement
			stmt = con.createStatement();

			// Executing
//			stmt.executeUpdate(qry);

			// Optional
			// Process
			ResultSet rs = stmt.executeQuery(qry2);
			while (rs.next()) {
				String id = rs.getString("id");
				System.out.print(id + " ");
				String name = rs.getString(2);
				System.out.print(name);
				System.out.println();
			}

//			System.out.println("Insertion Done");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			// Closing Costly Resource
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
