package com.sermo.web;

import com.sermo.web.domain.User;
import com.sermo.web.domain.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter326ApplicationTests {

	@Resource
	private UserRepository userRepository;

	@Before
	public void init(){
		userRepository.deleteAll();
	}

	@Test
	public void contextLoads() {
		userRepository.save(new User("ceshi1", 20));
		userRepository.save(new User("二冉", 22));

		Assert.assertEquals(2, userRepository.findAll().size());

		Assert.assertEquals(20, userRepository.findByUserName("ceshi1").getAge().intValue());

		userRepository.delete(userRepository.findByUserName("ceshi1"));

		Assert.assertEquals(1, userRepository.findAll().size());

	}

}
