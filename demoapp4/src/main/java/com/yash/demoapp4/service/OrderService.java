package com.yash.demoapp4.service;

import java.util.List;

import com.yash.demoapp4.model.Order;

public interface OrderService {
	public Order createOrder(Order order);
	public List<Order> getList();
	public Order getOrderById(Long id);

}
