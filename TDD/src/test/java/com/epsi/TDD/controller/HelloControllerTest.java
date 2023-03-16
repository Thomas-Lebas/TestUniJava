package com.epsi.TDD.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@WebMvcTest(HelloController.class)
public class HelloControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	
	@Test
	public void test_hello_endpoint() throws Exception {
		
		
		MvcResult result = mockMvc.perform( get("/hello"))
        .andDo(print())
		.andExpect(status().isOk())
		.andReturn();
		
		String content = result.getResponse().getContentAsString();

		assertEquals("Hello", content);
		

	}

	@Test
	public void test_hello_to_name_endpoint() throws Exception {
		
		String name = "toto";
		
		MvcResult result = mockMvc.perform( get("/hello/name/" + name ))
        .andDo(print())
		.andExpect(status().isOk())
		.andReturn();
		
		String content = result.getResponse().getContentAsString();

		assertEquals("Hello " + name, content);
		

	}
	
}
