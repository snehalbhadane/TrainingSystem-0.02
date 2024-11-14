package com.yash.demoapp4.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.yash.demoapp4.model.Order;
import com.yash.demoapp4.repository.OrderRepository;

public class OrderServiceTest {
	@InjectMocks
    private OrderService oService;

    @Mock
    private OrderRepository orderRepo;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFindEmployeeById() {
    	 Order o=new Order(1L,"Pencil Box","Box with 10 pencils");
        when(orderRepo.findById(1L)).thenReturn(Optional.of(o));
        Order found = oService.getOrderById(1L);
         assertEquals("Pencil Box", found.getName());
    }
}
