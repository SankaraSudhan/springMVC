package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.connection.util.ConnectionUtil;

import Model.UserInfo;

public class LoginDao {
public long login(UserInfo str2) throws ClassNotFoundException, SQLException {
	    long role = 0;
		
			
	    Connection con = ConnectionUtil.getDBconnect();
			
	    String query = "select first_name, mobile_number from User_info where user_name= ? and password= ? ";
			
	    PreparedStatement stmt = con.prepareStatement(query);
			
	    stmt.setString(1, str2.getUserName());
		stmt.setString(2, str2.getPassword());
			
		ResultSet rs = stmt.executeQuery( );
			
		if (rs.next()) {
			System.out.println("Welcome "+rs.getString("first_name") );
			 role = rs.getLong("mobile_number");
			} 
			else
			{
				System.out.println("Please enter the valid userName or password!!!");
			}

		
		return role;
		

	}

}
