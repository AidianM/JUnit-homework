package com.tts.junithomework;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tts.junithomework.controller.HomeController;

@SpringBootTest
class SmokeTest {

	@Autowired
	private HomeController controller;
	
	@Test
	void contextLoads() throws Exception {

		assertNotNull(controller);
		
	}

}
