package com.sermo.web;

import com.sermo.web.domain.p.User;
import com.sermo.web.domain.p.UserRepository;
import com.sermo.web.domain.s.Message;
import com.sermo.web.domain.s.MessageRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter324ApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private MessageRepository messageRepository;

	@Test
	public void contextLoads() {
		userRepository.save(new User("a", 1));
		userRepository.save(new User("b", 2));
		userRepository.save(new User("c", 3));
		userRepository.save(new User("d", 4));

		Assert.assertEquals(4, userRepository.findAll().size());

		messageRepository.save(new Message("01", "aa"));
		messageRepository.save(new Message("02", "bb"));

		Assert.assertEquals(2, messageRepository.findAll().size());
	}

}
