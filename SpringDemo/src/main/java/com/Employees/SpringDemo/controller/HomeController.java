package com.Employees.SpringDemo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Employees.SpringDemo.handler.Handler;
import com.Employees.SpringDemo.model.Employees;

@Controller
public class HomeController {
    @Autowired
    Handler handler;
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("index");
	}
	
	
	@RequestMapping(value="/RegisterServlet")
	public ModelAndView register(HttpServletResponse response,HttpServletRequest request) throws IOException{
		handler.EmployeeDetailsHandler(request);		
		return new ModelAndView("index");
		
		
	}
	
	@RequestMapping(value="/SearchServlets")
	public ModelAndView list(HttpServletResponse response,ModelMap map ,HttpServletRequest request) throws IOException{
		List<Employees> list = handler.view();	
		map.addAttribute("list",list);
		return new ModelAndView("listEmployees");
	}
	
	
}
