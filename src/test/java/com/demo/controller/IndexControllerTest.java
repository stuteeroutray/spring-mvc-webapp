package com.demo.controller;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class IndexControllerTest {
	private static IndexController indexController;
	private static MockMvc mockMvc;
	
	@BeforeAll
	public static void setup() {
		indexController = new IndexController();
		mockMvc = MockMvcBuilders.standaloneSetup(indexController).build();
	}
	
	@Test
	public void testIndex() throws Exception{
		mockMvc.perform(get("/"))
				.andExpect(status().isOk())
				.andExpect(view().name("index"));
	}
}
