package com.sermo.web;

import com.sermo.web.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter321ApplicationTests {

	private @Resource
	UserService service;

	@Before
	public void setup(){
		service.deleteAllUsers();
	}


	@Test
	public void contextLoads() {
		service.create("a", 1);
		service.create("b", 2);
		service.create("c", 3);

		Assert.assertEquals(3, service.findAllUsers().intValue());

		service.deleteByName("a");
		service.deleteByName("b");

		Assert.assertEquals(1, service.findAllUsers().intValue());
	}

}
