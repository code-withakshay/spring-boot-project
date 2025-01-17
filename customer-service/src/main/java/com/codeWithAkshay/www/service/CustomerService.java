package com.codeWithAkshay.www.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeWithAkshay.www.exception.ResourceNotFoundException;
import com.codeWithAkshay.www.model.Customer;
import com.codeWithAkshay.www.repo.CustomerRepository;

@Service
public class CustomerService 
{
	@Autowired
	CustomerRepository customerRepository;

	public Customer addCustomer(Customer customer)
	{
		return customerRepository.save(customer);
	}
	
	public Iterable<Customer> getAllCustomers()
	{
		return customerRepository.findAll();
	}
	
	public Customer getCustomerById(int custId)
	{
		return customerRepository.findById(custId).orElseThrow(()-> new ResourceNotFoundException("Id Not Found"));
	}
	
	public String updateCustomer(Customer customer)
	{
		Customer cust=customerRepository.findById(customer.getCustId()).orElseThrow(()-> new ResourceNotFoundException("Id Not Found"));
		cust.setCustName(customer.getCustName());
		cust.setCustAddress(customer.getCustAddress());
		customerRepository.save(cust);
		return "Record Updated";
	}
	
	
	public String deleteCustomer(int custId)
	{
		Customer customer=customerRepository.findById(custId).orElseThrow(()-> new ResourceNotFoundException("Id Not Found"));
		customerRepository.delete(customer);
		return "Record Deleted";
	}
}