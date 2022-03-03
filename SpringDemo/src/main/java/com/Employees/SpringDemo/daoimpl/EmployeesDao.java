package com.Employees.SpringDemo.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Employees.SpringDemo.model.Employees;
@Repository
@Transactional
public class EmployeesDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public int registerUser(Employees add) {
		int i = 0;

		String query = " insert into employee_Details(Emp_Name, Emp_Code, Email, Addess1, Address2, City, State,Date_Of_Birth,Joining_Date)values (?,?,?,?,?,?,?,?,?)";

		jdbcTemplate.update(query,
				new Object[] { add.getEmployeeName(), add.getEmployeeCode(), add.getEmail(), add.getAddess1(),
						add.getAddress2(), add.getCity(), add.getState(), java.sql.Date.valueOf(add.getDateOfBirth()),
						java.sql.Date.valueOf(add.getJoiningDate()) });

		i = 1;

		return i;
	}

	
	public List<Employees> showEmployees() {

		String query = "select Emp_Name, Emp_Code, Email, Addess1, Address2, City, State,Date_Of_Birth,Joining_Date from employee_Details";
	
		List<Employees> list = jdbcTemplate.query(query, new Mapper());
		return list;
		
		
	}
	
}
