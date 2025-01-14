package com.jsp.myApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyApp {
	public static void main(String[] args) {
		Connection con = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
//		String qry1 = "insert into college.student values(1,'Raja raj')";
//		String qry2 = "update college.student set name='riya' where rollno=1";
		String qry3 = "delete from college.student where rollno = 2";
		try {
			// Load and Register
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Registered Success");
			// Establishing Connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=");
			System.out.println("Connection Established");

			/*******************************************/
			// creating statement
//			stmt = con.createStatement();
			// for DML Command Use executeUpdate()
//			int res = stmt.executeUpdate(qry1);
//			int res = stmt.executeUpdate(qry2);
//			int res = stmt.executeUpdate(qry3);
//			System.out.println("Record inserted");
//			System.out.println(res);

			/*******************************************/
			// for DQL Query use
//			pstm                          t = con.prepareStatement("select * from college.student where rollno=?  or name=?");
//			pstmt.setInt(1, 3);
//			pstmt.setString(2, "riya");
//			rs = pstmt.executeQuery();
//			while (rs.next()) {
//				String name = rs.getString("name");
//				System.out.println(name);
//			}

			/*******************************************/
			// inserting multiple statement
			pstmt = con.prepareStatement("insert into college.student values(?,?)");
			pstmt.setInt(1, 5);
			pstmt.setString(2, "Wsf");
			pstmt.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
//				stmt.close();
				pstmt.close();
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
