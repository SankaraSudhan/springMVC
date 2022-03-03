package com.Employees.SpringDemo.handler;

import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Employees.SpringDemo.daoimpl.EmployeesDao;
import com.Employees.SpringDemo.model.Employees;

@Component
public class Handler {
	@Autowired 
	EmployeesDao empDao;
	public int EmployeeDetailsHandler(HttpServletRequest req) {
		
		String empName = req.getParameter("EmployeeName");
		System.out.println(empName);
		String empCode = req.getParameter("EmpCode");
		String email = req.getParameter("UserEmail");
		email = email.trim().toLowerCase();
		String address1 = req.getParameter("address1");
		String address2 = req.getParameter("address2");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		LocalDate dob = LocalDate.parse(req.getParameter("dob"));
		System.out.println(dob);
		LocalDate joiningDate = LocalDate.parse(req.getParameter("joiningDate"));
		
		Employees emp = new Employees(empName,empCode,email,address1,address2,city,state,dob,joiningDate);
		

		int register = empDao.registerUser(emp);
		return register;

	}
public List <Employees> view()
{
	return empDao.showEmployees();
	
}
}
