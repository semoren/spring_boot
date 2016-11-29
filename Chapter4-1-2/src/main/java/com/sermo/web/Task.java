package com.sermo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Future;

/**
 * @author sermo
 * @version 2016/11/29.
 */
@Component
public class Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(Task.class);

    public static Random random = new Random();

    //    @Async所修饰的函数不要定义为static类型，这样异步调用不会生效
    @Async
    public Future<String> doTaskOne() throws Exception {
        LOGGER.info("开始执行任务1");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        LOGGER.info("完成任务1, 耗时: " + (end - start) + " 毫秒");
        return new AsyncResult<>("taskOne success");
    }

    @Async
    public Future<String> doTaskTwo() throws Exception {
        LOGGER.info("开始执行任务2");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        LOGGER.info("完成任务2, 耗时: " + (end - start) + " 毫秒");
        return new AsyncResult<>("taskTwo success");
    }

    @Async
    public Future<String> doTaskThree() throws Exception {
        LOGGER.info("开始执行任务3");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        LOGGER.info("完成任务3, 耗时: " + (end - start) + " 毫秒");
        return new AsyncResult<>("taskThree success");
    }
}
