package com.codeWithAkshay.www.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codeWithAkshay.www.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
