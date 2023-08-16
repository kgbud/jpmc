package com.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class mysql {

	public static void main(String[] args) {
		//Loading the specific DB driver
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
		
		// creating DB connection
		 String username = "root";
		 String password ="mysql";
		 String dbUrl = "jdbc:mysql://localhost:3306/school_db";
		 
		
			Connection connection = DriverManager.getConnection(dbUrl,username,password);
			
			String sqlQuery = "select * from student";
			
			PreparedStatement ps = connection.prepareStatement(sqlQuery);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println("database found");
			}
			else {
				System.out.println("no found");
			}
		} catch ( ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
