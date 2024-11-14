package com.yash.demoapp3.service;

import java.util.List;
import java.util.Optional;

import com.yash.demoapp3.model.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();
	public Customer createCustomer(Customer customer);

}
