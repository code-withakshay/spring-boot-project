package com.codeWithAkshay.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/paytm")
public class PaytmServiceApplication 
{
	@GetMapping("/pay")
	public String paymentProcess()
	{
		return "Payment Pocess method called in paytm-service";
	}
	public static void main(String[] args) 
	{
		SpringApplication.run(PaytmServiceApplication.class, args);
	}

}
