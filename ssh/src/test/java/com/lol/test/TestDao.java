package com.lol.test;

import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lol.lw.service.UserService;

public class TestDao extends TestCase {
	
	@Test
	public void testGetUsers(){
		ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) act.getBean("userService");
		userService.getUsers();
	}
}
