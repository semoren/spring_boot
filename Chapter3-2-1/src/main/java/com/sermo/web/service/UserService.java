package com.sermo.web.service;

/**
 * @author sermo
 * @version 2016/11/28.
 */
public interface UserService {

    void create(String name, Integer age);

    void deleteByName(String name);

    void deleteAllUsers();

    Integer findAllUsers();
}
