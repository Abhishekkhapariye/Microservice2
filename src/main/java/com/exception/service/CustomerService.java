package com.exception.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exception.entity.Customer;
import com.exception.repo.CustomerRepo;


@Service
public class CustomerService {
	
	@Autowired
	CustomerRepo customerRepo;
	
	public List<Customer> getAllCustomers() {
		return this.customerRepo.findAll();
		
	}

	public Customer getCustomerById(Integer id) {
		
		return this.customerRepo.findById(id).get();
	}
	
	public Customer addCustomer(Customer customer) {
		
		return customerRepo.save(customer);
	}

}
