package com.assignment.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.assignment.service.UserService;

@SpringBootTest
@AutoConfigureMockMvc
@WebMvcTest(controllers = UserControllerTest.class)
public class UserControllerTest {
	@Autowired
	MockMvc mockMvc;
	@MockBean
	UserService userService;

	@Test
	public void userServiceGetUser() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/assignment/getAllUser"))
				.andExpect(MockMvcResultMatchers.status().isOk());
	};
}
