package com.Employees.SpringDemo.model;

import java.time.LocalDate;

public class Employees {
	private String employeeName;
	private String employeeCode;
	private String email;
	private String addess1;
	private String address2;
	private String city;
	private String state;
	private LocalDate dateOfBirth;
	private LocalDate joiningDate;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddess1() {
		return addess1;
	}
	public void setAddess1(String addess1) {
		this.addess1 = addess1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	public Employees(String employeeName, String employeeCode, String email, String addess1, String address2,
			String city, String state, LocalDate dateOfBirth, LocalDate joiningDate) {
		super();
		this.employeeName = employeeName;
		this.employeeCode = employeeCode;
		this.email = email;
		this.addess1 = addess1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.dateOfBirth = dateOfBirth;
		this.joiningDate = joiningDate;
	}
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}	
}

