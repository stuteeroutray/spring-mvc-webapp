package com.demo.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.domain.Product;
import com.demo.services.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("jpadao")
@SpringBootTest
public class ProductServiceJpaDaoImplTest {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @SuppressWarnings("unchecked")
	@Test
    public void testListMethod() throws Exception {

        List<Product> products =  (List<Product>) productService.listAll();

        assert products.size() == 5;

    }
}