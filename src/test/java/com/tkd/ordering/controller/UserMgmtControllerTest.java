package com.tkd.ordering.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(value=UserMgmtController.class,secure=false)
public class UserMgmtControllerTest {
	
	private final String apiPrefix = "/api";
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testLogin() throws Exception{
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post(apiPrefix + "/login").accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		MockHttpServletResponse response = result.getResponse();
		System.out.println(response.getStatus());
		assertEquals(HttpStatus.OK.value(), response.getStatus());
	}
	
	@Test
	public void testLogout() throws Exception{
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post(apiPrefix + "/logout").accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		MockHttpServletResponse response = result.getResponse();
		System.out.println(response.getStatus());
		assertEquals(HttpStatus.OK, response.getStatus());
	}

}
