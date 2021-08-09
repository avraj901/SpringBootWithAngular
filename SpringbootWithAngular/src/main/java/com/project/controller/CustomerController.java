package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public void saveCustomerData(@RequestBody Customer customer) {
		
		customerService.insertCustomerDetails(customer);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void deleteCustomerService(@PathVariable long id) {
		
		customerService.deleteCustomerDetails(id);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public void updateCustomerDetails(@RequestBody Customer customer) {
		
		customerService.updateCustomerDetails(customer);
	}
	
}
