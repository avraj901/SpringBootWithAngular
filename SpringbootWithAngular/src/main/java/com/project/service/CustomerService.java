package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

	public void insertCustomerDetails(Customer customer) {
		
		
       	customerRepository.save(customer);
		
		
	}

	public void deleteCustomerDetails(long id) {

		customerRepository.deleteById(id);
	}

	public void updateCustomerDetails(Customer customer) {

		customerRepository.save(customer);
	}

	
}
