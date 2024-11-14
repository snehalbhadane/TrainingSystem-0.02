package com.yash.demoapp4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.demoapp4.model.Order;

public interface OrderRepository extends JpaRepository< Order,Long>{

}
