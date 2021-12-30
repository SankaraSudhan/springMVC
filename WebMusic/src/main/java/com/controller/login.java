package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Connection.ConnectionUtil;
import com.Model.UserInfo;
import com.dao.LoginDao;
@WebServlet("/loginWeb")
public class login extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		UserInfo checkUser = null;
		String uname = req.getParameter("text");
		System.out.println(uname);
		
		String password = req.getParameter("pass");
		System.out.println(password);
		
		UserInfo str2 = new UserInfo();

		str2.setUserName("text");

		str2.setPassword("pass");

		

		LoginDao obj1 = new LoginDao();
		try {
			str2 = obj1.login(str2);
			
			res.sendRedirect("home.jsp");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
