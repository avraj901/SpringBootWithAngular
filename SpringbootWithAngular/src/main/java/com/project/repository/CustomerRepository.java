package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.project.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

	//@Query(value = "SELECT * FROM customer c WHERE c.first_name = avanish", nativeQuery = true)
	List<Customer> findByLastName(String name);
	
	
}
