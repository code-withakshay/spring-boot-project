package com.codeWithAkshay.www;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController 
{
	//handler method
	@RequestMapping("/home")
	@ResponseBody
	public String home()
	{
		return "I love Spring Boot...!";
	}
}
