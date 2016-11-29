package com.sermo.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.concurrent.Future;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter412ApplicationTests {

	@Resource
	private Task task;


	@Test
	public void contextLoads() throws Exception{
		long start = System.currentTimeMillis();

		Future<String> task1 = task.doTaskOne();
		Future<String> task2 = task.doTaskTwo();
		Future<String> task3 = task.doTaskThree();

		while (true) {
			if (task1.isDone() && task2.isDone() && task3.isDone()){
				break;
			}
			Thread.sleep(1000);
		}

		long end = System.currentTimeMillis();
		System.out.println("task total times=" + (end-start));
	}

}
