package com.epsi.TDD.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.servlet.mvc.Controller;

@WebMvcTest(Controller.class)
public class GameControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testPlay() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/game/play/pierre"));
	}

	@Test
	public void testPlayInvalidAction() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/game/play/invalid-action"));

	}
}
