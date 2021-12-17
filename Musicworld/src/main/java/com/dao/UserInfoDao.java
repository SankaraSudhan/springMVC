package com.dao;
import java.sql.*;
import java.util.Scanner;

import com.connection.util.ConnectionUtil;

import Model.UserInfo;

public class UserInfoDao {
	public void insertUser() throws ClassNotFoundException, SQLException
	{
		
		boolean flagCheck =false;
		String firstName;
		String lastName;
		String email_id;
		String userName;
		String password;
		String role;
		long mobileNumber=0;
		

		Scanner sc = new Scanner(System.in);

		do {
		System.out.println("Enter your firstName: ");
		firstName = sc.nextLine();
		if (firstName.matches("[a-zA-Z]+")&&firstName!="")
		{
		//System.out.println("Your firstName is valid");
		flagCheck=false;
		}
		else
		{
		System.out.println("its invalid!!");
		flagCheck=true;
		}
		}while(flagCheck);

		do {
		System.out.println("Enter your lastName: ");
		lastName = sc.nextLine();
		if (lastName.matches("[a-zA-Z]+")&&lastName!="")
		{
		//System.out.println("Your lastName is valid: ");
		flagCheck=false;
		}
		else
		{
		System.out.println("its invalid!!");
		flagCheck=true;
		}
		}while(flagCheck);

		do {
		System.out.println("Enter your email id: ");
		email_id =sc.nextLine();
		if (email_id.matches("[a-z0-9]+[@][a-z]+[.][a-z]+")&&email_id!="")
		{
		//System.out.println("Your emailId is valid");
		flagCheck=false;
		}
		else
		{
		System.out.println("its invalid!!");
		flagCheck=true;
		}}
		while(flagCheck);


		do {
		System.out.println("Enter your userName: ");
		    userName = sc.nextLine();
		if (userName.matches("[a-z]+")&&userName!="")
		{
		//System.out.println("Your userName is valid");
		flagCheck=false;
		}
		else
		{
		System.out.println("its invalid!!");
		flagCheck=true;
		}
		}while(flagCheck);

		do {
		System.out.println("Enter your password: ");
		password = sc.nextLine();
		if (password.matches("[a-zA-Z0-9@#]+")&&password!="")
		{
		//System.out.println("Your password is valid");
		flagCheck=false;
		}
		else
		{
		System.out.println("its invalid!!");
		flagCheck=true;
		}
		}while(flagCheck);

		do {
		System.out.println("Enter Your Role: ");
		role = sc.nextLine();
		if (role.matches("[a-zA-Z]+")&&role!="")
		{
		//System.out.println("Your role is valid");
		flagCheck=false;
		}
		else
		{
		System.out.println("its invalid!!");
		flagCheck=true;
		}
		}while(flagCheck);

		do {
		System.out.println("Enter your mobileNumber: ");
		String  check=sc.nextLine();
		if (check.matches("[0-9]{10}")&&check!="")
		{
		//System.out.println("Your mobileNumber is valid");
		flagCheck=false;
		mobileNumber=Long.parseLong(check);
		break;
		}
		else
		{
		System.out.println("its invalid");
		flagCheck=true;
		}

		} while(flagCheck);
		

		
		UserInfo str = new UserInfo(firstName, lastName, email_id, userName, password, role, mobileNumber);
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
		System.out.println("You're Registered successfully");
	}

}
