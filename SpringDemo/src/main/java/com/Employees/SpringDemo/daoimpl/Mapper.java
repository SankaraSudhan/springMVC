package com.Employees.SpringDemo.daoimpl;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;

import com.Employees.SpringDemo.model.Employees;



public class Mapper implements RowMapper<Employees> {

	@Override
	public Employees mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employees employees = new Employees(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
				rs.getString(5), rs.getString(6), rs.getString(7), rs.getDate(8).toLocalDate(),
				rs.getDate(9).toLocalDate());
	
		return employees;
	}

	
		
}