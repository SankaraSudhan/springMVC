package com.musicworld.testmain;

import java.util.*;
import java.sql.*;

import com.dao.LoginDao;
import com.dao.UserInfoDao;

import Model.UserInfo;

public class MusicWorldTestMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		UserInfoDao obj = new UserInfoDao();
				
		Scanner sc = new Scanner(System.in);

		int select;
	
		System.out.println("         'Welcome to MusicWorld' \n  Select your option: \n  1)Register/Signup \t  2)Login/Signin ");
		select = Integer.parseInt(sc.nextLine());

		switch (select) {
		
		case 1:
		UserInfoDao obj2 = new UserInfoDao();
		obj2.insertUser();
		break;
		
		case 2:
		LoginDao obj1 = new LoginDao();
		obj1.login();
		
		break;
		
		default:
		System.out.println("Please enter the valid details!!!");
		break;

		}

	}


		
}
