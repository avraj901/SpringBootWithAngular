package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Customer;
import com.project.service.CustomerService;

@RestController
@CrossOrigin
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value="customer/{name}", method=RequestMethod.GET)
	public List<Customer> getCustomerDetails(@PathVariable String name) {
		
		System.out.println("name ::"+name);
		return customerService.findByName(name);
	}
}
