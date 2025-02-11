package com.jsp.demoApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		String qry1 = "insert into college.student values(10623456,'Riya raj')";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Registered Successfully");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=");
			System.out.println("Connection Established");
			stmt = con.createStatement();
			int res = stmt.executeUpdate(qry1);
			System.out.println(res);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
