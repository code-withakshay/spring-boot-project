package com.codeWithAkshay.www.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codeWithAkshay.www.model.Employee;
import com.codeWithAkshay.www.repository.EmployeeRepository;

@Controller
public class EmployeeController 
{
	@Autowired 
	EmployeeRepository employeeRepository;
	
	@RequestMapping("/")
	public String home()
	{
		return "index.jsp";
	}
	
	@RequestMapping("/addEmp")
	public String addEmployee(Employee employee)
	{
		employeeRepository.save(employee);
		
		return "index.jsp";
	}
}