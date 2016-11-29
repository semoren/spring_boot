package com.sermo.web;

import com.sermo.web.domain.UserMapper;
import com.sermo.web.domain.UserVo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter327ApplicationTests {

	@Resource
	private UserMapper mapper;

	@Before
	public void init(){
//		mapper.deleteAll();
	}

	@Test
	public void contextLoads() {
//		mapper.insert("ceshi", 11);
//		Assert.assertEquals(11, mapper.findByName("ceshi").getAge().intValue());
		Map<String, Object> map = new HashMap<>();
		map.put("name", "bb");
		map.put("age", 30);
		mapper.insertByMap(map);
		Assert.assertEquals(30, mapper.findByName("bb").getAge().intValue());

		Assert.assertEquals(2, mapper.findAll().size());

		List<UserVo> userVos = mapper.findAll();
		for (UserVo vo : userVos) {
			System.out.println(vo.getAge() + " " + vo.getUsername());
		}
	}

}
