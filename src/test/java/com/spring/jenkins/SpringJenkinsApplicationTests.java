package com.spring.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {

	
	public static Logger logger= LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
	
	@Test
	public  contextLoads() {
		logger.info("Test spring project started");
		
		logger.info("Test spring project started in second........");
		
		
		logger.info("Test project to check if autobuild is happeneing or not ........");
		assertEquals(true, true);
	}
	
	

}
