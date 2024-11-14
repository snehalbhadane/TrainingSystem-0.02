package com.yash.demoapp3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.demoapp3.exceptions.ResourceNotFoundException;
import com.yash.demoapp3.model.Customer;
import com.yash.demoapp3.repository.CustomerRepository;
import com.yash.demoapp3.service.CustomerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class CustomerController {
	@Autowired
	private CustomerService custService;

	@GetMapping("/greet")
	public String greet()
	{
		return "Hello spring";
	}
	
	@GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return custService.getCustomers();
    }
	
	@PostMapping("/customer")
	 public Customer createCustomer(@Valid @RequestBody Customer customer) {
	  return custService.createCustomer(customer);
	 }

    
	

}
