package com.yash.demoapp3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.demoapp3.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
