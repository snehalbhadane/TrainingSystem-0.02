package com.yash.demoapp4.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.yash.demoapp4.model.Order;
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class OrderRepositoryTest {
	@Autowired
	private OrderRepository orderRepo;

	
	@Test
	public void test_saveMethod_GivenOrderRecord_ShouldSaveOrder()
	{           Order o=new Order(1L,"Pencil Box","Box with 10 pencils");
				Order result=orderRepo.save(o);
				assertNotNull(result);
				
	}
	
	@Test
    public void testGetEmployee() {
		
		Order o = orderRepo.save(new Order(1L,"Pencil Box","Box with 10 pencils"));
       Order result = orderRepo.findById(o.getId()).orElse(null);
        assertNotNull(result);
        assertEquals(o.getId(), result.getId());
    }

    @Test
    public void testGetListOfEmployees() {
    	orderRepo.save(new Order(1L,"Pencil Box","Box with 10 pencils"));
    	orderRepo.save(new Order(2L,"Pen Box","Box with 10 pen"));
        List<Order> result= orderRepo.findAll();
        assertNotNull(result);
        assertEquals(2,result.size());
    }

    @Test
    public void testUpdateEmployee() {
    	Order o = orderRepo.save(new Order(1L,"Pencil Box","Box with 10 pencils"));
        o.setName("Pencil new Box");
        orderRepo.save(o);
        Order result = orderRepo.findById(o.getId()).orElse(null);
        assertNotNull(result);
        assertEquals("Pencil new Box", result.getName());
    }

    @Test
    public void testDeleteEmployee() {
    	Order o = orderRepo.save(new Order(1L,"Pencil Box","Box with 10 pencils"));
    	orderRepo.deleteById(o.getId());
       Order result = orderRepo.findById(o.getId()).orElse(null);
        assertNull(result);
    }
	
	

}
