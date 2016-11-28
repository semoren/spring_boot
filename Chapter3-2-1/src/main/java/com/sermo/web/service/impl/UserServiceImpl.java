package com.sermo.web.service.impl;

import com.sermo.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author sermo
 * @version 2016/11/28.
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(String name, Integer age) {
        jdbcTemplate.update("INSERT INTO user(name, age) values(?,?)", name, age);
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("DELETE FROM user where name=?", name);
    }

    @Override
    public void deleteAllUsers() {
        jdbcTemplate.update("DELETE FROM user");
    }

    @Override
    public Integer findAllUsers() {
        return jdbcTemplate.queryForObject("select count(1) from user", Integer.class);
    }
}
