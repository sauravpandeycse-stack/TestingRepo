package com.TestingJenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoProjectJenkinsApplicationTests {

	public static Logger logger=LoggerFactory.getLogger(DemoProjectJenkinsApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("Test case executing ...");
		logger.info("Test case exexuting second statement");
		assertEquals(true, true);
		
	}

}
