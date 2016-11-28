package com.sermo;

import com.sermo.pro.BlogProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Chapter211Application.class)
public class Chapter211ApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(Chapter211ApplicationTests.class);

	@Autowired
	private BlogProperties blogProperties;

	@Test
	public void contextLoads() {
		Assert.assertEquals(blogProperties.getName(),"sermo");
		Assert.assertEquals(blogProperties.getTitle(), "Spring Boot");
		logger.info("随机字符串测试");
		logger.info("随机字符串 {}", blogProperties.getValue());
		logger.info("随机int {}", blogProperties.getNumber());
		logger.info("随机long {}", blogProperties.getBignumber());
		logger.info("10以内随机数 {}", blogProperties.getTest1_10());
		logger.info("10-20之间随机数 {}", blogProperties.getTest10_20());
	}

}
