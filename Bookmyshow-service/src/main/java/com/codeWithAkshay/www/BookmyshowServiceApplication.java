package com.codeWithAkshay.www;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class BookmyshowServiceApplication 
{
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/book")
	public String bookShow()
	{
		String val1=restTemplate.getForObject("http://localhost:8181/paytm/pay", String.class);
		String val2=restTemplate.getForObject("http://localhost:7171/notification/send",String.class);
	
		return val1+" "+val2;
	}
	
	public static void main(String[] args) 
	{
		SpringApplication.run(BookmyshowServiceApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate() 
	{
		return new RestTemplate();	
	}


}
