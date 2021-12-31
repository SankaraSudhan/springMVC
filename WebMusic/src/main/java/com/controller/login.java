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
@WebServlet("/login")
public class login extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		UserInfo checkUser = null;
		String uname = req.getParameter("text");
		System.out.println(uname);
		
		String password = req.getParameter("pass");
		System.out.println(password);
			
		
		LoginDao login = new LoginDao();
		try 
		{
			Boolean str = login.login(uname, password);
			
			if(str)
			{
				String admin = login.Checkadmin(uname, password);
				if(admin =="yes")
				{
				res.sendRedirect("Admin.jsp");
			}
				else
				{
					res.sendRedirect("home.jsp");
				}
			}
			else
			{
				res.getWriter().print("Please Register..!");
			}
		}
				
	
	catch (Exception e) {
			// TODO Auto-generated catch block
		}
		
	}

}
