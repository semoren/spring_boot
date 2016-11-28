package com.sermo.web;

import com.sermo.web.jpa.UserRepository;
import com.sermo.web.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter322ApplicationTests {

	@Resource
	private UserRepository userRepository;

	@Test
	public void contextLoads() {
		userRepository.save(new User("a",1));
		userRepository.save(new User("b",2));
		userRepository.save(new User("c",3));
		userRepository.save(new User("d",4));
		userRepository.save(new User("e",5));
		userRepository.save(new User("f",6));


		Assert.assertEquals(6, userRepository.findAll().size());

		Assert.assertEquals(2, userRepository.findByName("b").getAge().intValue());

		Assert.assertEquals(3, userRepository.findUser("c").getAge().intValue());

		Assert.assertEquals("e", userRepository.findByNameAndAge("e", 5).getName());

		userRepository.delete(userRepository.findByName("f"));

		Assert.assertEquals(5, userRepository.findAll().size());
	}

}
