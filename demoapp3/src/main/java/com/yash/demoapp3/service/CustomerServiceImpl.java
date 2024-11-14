package com.yash.demoapp3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.yash.demoapp3.exceptions.ResourceNotFoundException;
import com.yash.demoapp3.model.Customer;
import com.yash.demoapp3.repository.CustomerRepository;


@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository custRepo;
	
	@Override
	public List<Customer> getCustomers() {
		
		return custRepo.findAll();
	}

	@Override
	public Customer createCustomer(Customer customer) {
		
		return custRepo.save(customer);
	}

	

	
}
