package com.demo.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.domain.Customer;
import com.demo.services.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("jpadao")
@SpringBootTest
public class CustomerServiceJpaDaoImplTest {
	private CustomerService customerService;
	@Autowired
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
    @SuppressWarnings("unchecked")
	@Test
    public void testListMethod() throws Exception {
        List<Customer> customers =  (List<Customer>) customerService.listAll();
        assert customers.size() == 3;
    }
}