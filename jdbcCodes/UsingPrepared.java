package com.jdbcCodes;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UsingPrepared {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		System.out.println("Established");
		PreparedStatement pstmt = dbcon.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?)");

		
		pstmt.setInt(1, 5);
		pstmt.setString(2,"using");
		pstmt.setDouble(3, 80.0);
		
		
		int update =pstmt.executeUpdate();
		int updated= pstmt.executeUpdate("DELETE FROM EMPLOYEE WHERE ID = 12");
		int updated1= pstmt.executeUpdate("UPDATE EMPLOYEE SET name='EMPLOYEE' WHERE name='updated'");		
		
		ResultSet rs = pstmt.executeQuery("SELECT * FROM EMPLOYEE");
		while (rs.next()) {
			int id = rs.getInt("Id");
			String name = rs.getString("name");
			double sal = rs.getDouble("salary");
			System.out.println("Id= " + id + " name=" + name + " phone no= " + sal);

		}
		
		rs.close();
		pstmt.close();
		dbcon.close();

	}

}
