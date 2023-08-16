package com.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Mysql_demo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String username = "root";
			String password = "mysql";
			String dbUrl = "jdbc:mysql://localhost:3306/school_db";

			Connection connection =DriverManager.getConnection(dbUrl, username, password);
			
            String sqlQuery = "select * from student";
			
			PreparedStatement ps = connection.prepareStatement(sqlQuery);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getString("idStudent") + "," +rs.getString("StudentName")+","+rs.getString("StudentAge")+","+rs.getString("address"));
				
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}


				

				

			

		