package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.connection.util.ConnectionUtil;

import Model.UserInfo;

public class LoginDao {
public void login() throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your userName: ");			
		String username = sc.nextLine();
			
		System.out.println("Enter your password: ");
	    String passname = sc.nextLine();
			
	    UserInfo str = new UserInfo();
			
	    str.setUserName(username);
			
	    str.setPassword(passname);
			
	    Connection con = ConnectionUtil.getDBconnect();
			
	    String query = "select first_name from User_info where user_name= ? and password= ? ";
			
	    PreparedStatement stmt = con.prepareStatement(query);
			
	    stmt.setString(1, str.getUserName());
		stmt.setString(2, str.getPassword());
			
		ResultSet rs = stmt.executeQuery( );
			
		if (rs.next()) {
			System.out.println("Welcome "+rs.getString("first_name") );
			} 
			else
			{
				System.out.println("Please enter the valid userName or password!!!");
			}

		

	}

}
