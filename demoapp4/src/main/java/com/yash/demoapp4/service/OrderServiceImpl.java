package com.yash.demoapp4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.demoapp4.model.Order;
import com.yash.demoapp4.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository orderRepo;

	@Override
	public Order createOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrderById(Long id) {
		return null;
		
		
	}

}
