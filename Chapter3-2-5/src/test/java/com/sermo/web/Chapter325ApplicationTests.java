package com.sermo.web;

import com.sermo.web.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter325ApplicationTests {

	@Resource
	private StringRedisTemplate template;

	@Resource
	private RedisTemplate<String, User> redisTemplate;

	@Test
	public void contextLoads() {
		template.opsForValue().set("aa", "bb");
		Assert.assertEquals("bb", template.opsForValue().get("aa"));
	}

	@Test
	public void test(){
		User user = new User("测试", 20);
		redisTemplate.opsForValue().set(user.getUserName(), user);

		Assert.assertEquals(20, redisTemplate.opsForValue().get("测试").getAge().intValue());
	}

}
