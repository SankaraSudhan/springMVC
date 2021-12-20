package com.dao;
import java.sql.*;
import java.util.Scanner;

import com.connection.util.ConnectionUtil;

import Model.UserInfo;

public class UserInfoDao {
	public void insertUser(UserInfo str) throws ClassNotFoundException, SQLException
	{
		
	
		Connection con= ConnectionUtil.getDBconnect();
		String query = " insert into User_Info( first_name,  last_name, email_Id, user_name, password, role, mobile_number)values (?,?,?,?,?,?,?)";
		
		PreparedStatement stmt= con.prepareStatement(query);
		
		stmt.setString(1, str.getFirstName());
		stmt.setString(2, str.getLastName());
		stmt.setString(3, str.getEmailId());
		stmt.setString(4, str.getUserName());
		stmt.setString(5, str.getPassword());
		stmt.setString(6, str.getRole());
		stmt.setLong(7, str.getMobileNumber());
		
		stmt.executeUpdate();
		//System.out.println("You're Registered successfully");
	}
	
public void update (UserInfo str1) throws ClassNotFoundException, SQLException {
    	
    	String update="update user_info set first_name=?, last_name=?,email_id=?, password=?,role=?, mobile_number=? where User_name = ?";
    	//+str1.getUserName()+"'"
    	System.out.println();
    	Connection con=ConnectionUtil.getDBconnect();
		PreparedStatement stmt=con.prepareStatement(update);
		
		stmt.setString(1, str1.getFirstName());
		stmt.setString(2, str1.getLastName());
		stmt.setString(3, str1.getEmailId());
		stmt.setString(4, str1.getPassword());
		stmt.setString(5, str1.getRole());
		stmt.setLong(6, str1.getMobileNumber());
		stmt.setString(7, str1.getUserName());

		int result=stmt.executeUpdate();
		
		System.out.println(result+ " is updated !!");
    }
	
    
    public void delete (String userName) throws ClassNotFoundException, SQLException {
		
		String delete="delete from user_info where user_name=?";
		
		Connection con=ConnectionUtil.getDBconnect();
		
		PreparedStatement stmt=con.prepareStatement(delete);
		stmt.setString(1, userName);
		
		int res=stmt.executeUpdate();
//		System.out.println(res + "is deleted");
		stmt.close();
		con.close();		
	}

	
}
