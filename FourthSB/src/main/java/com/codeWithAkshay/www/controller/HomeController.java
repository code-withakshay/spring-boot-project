package com.codeWithAkshay.www.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Akshay")
public class HomeController 
{
	@GetMapping("/home")
	public String home()
	{
		return "RestController Example";
	}
}
