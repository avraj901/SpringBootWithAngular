package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Customer;
import com.project.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public List<Customer> findByName(String name){
		
		System.out.println("CustomerService.findByName"+name);
		return customerRepository.findByLastName(name);
	}
}
