package com.jdbcCodes;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class First {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		System.out.println("Established");
		Statement stmt = dbcon.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT * FROM NEW");
		while (rs.next()) {
			int id = rs.getInt("Id");
			String name = rs.getString("name");
			int ph = rs.getInt("phone");
			System.out.println("Id= " + id + " name=" + name + " phone no= " + ph);

		}

		Statement stmt1 = dbcon.createStatement();

		String sql = ("UPDATE NEW set name='xyzz-updated' WHERE name='updated'");
		stmt1.executeUpdate(sql);
		while (rs.next()) {
			String idd = rs.getString("name");
			System.out.println("id=" + idd);

		}


		rs.close();
		stmt.close();
		stmt1.close();
		dbcon.close();

	}

}
