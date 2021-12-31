package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.Connection.ConnectionUtil;
import com.Model.UserInfo;


public class LoginDao {
public boolean login(String username, String Password) throws ClassNotFoundException, SQLException 
{
	    long role = 0;
	    UserInfo userInfo = null;
			
	    Connection con = ConnectionUtil.getDBconnect();
			
	    String query = "select * from User_info where user_name= ? and password= ? ";
			
	    PreparedStatement stmt = con.prepareStatement(query);
			
	    stmt.setString(1, username);
		stmt.setString(2, Password);
			
		ResultSet rs = stmt.executeQuery( );
			
		while (rs.next()) {
			return true;
//			userInfo = new UserInfo(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getLong(7),rs.getDouble(8));
//			System.out.println("Welcome "+rs.getString("first_name") );
//			 role = rs.getLong("mobile_number");
			} 
		return false;
		

	}

   public String Checkadmin(String username, String Password) throws SQLException, ClassNotFoundException
   {
	   
	   String adm = "";
	    Connection con = ConnectionUtil.getDBconnect();
		
	    String query = "select * from User_info where user_name= ? and password= ? ";
			
	    PreparedStatement stmt = con.prepareStatement(query);
			
	    stmt.setString(1, username);
		stmt.setString(2, Password);
			
		ResultSet rs = stmt.executeQuery( );
		
		if(rs!=null)
		{
			while(rs.next())
			{
				adm = rs.getString("Role");
				
				if(adm.equalsIgnoreCase("admin"))
				{
					return adm ="yes";
				}
				else
				{
					return adm ="no";

				}
			}
		}

	   
	   
	return adm;
	   
   }



}
