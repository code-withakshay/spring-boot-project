package com.codeWithAkshay.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/notification")
public class NotificationServiceApplication 
{
	@GetMapping("/send")
	public String sendEmail()
	{
		return "notification service exceted";
	}
	public static void main(String[] args) 
	{
		SpringApplication.run(NotificationServiceApplication.class, args);
	}

}
