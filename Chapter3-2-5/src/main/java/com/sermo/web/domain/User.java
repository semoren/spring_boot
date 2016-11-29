package com.sermo.web.domain;

import java.io.Serializable;

/**
 * @author sermo
 * @version 2016/11/29.
 */
public class User implements Serializable{

    private String userName;

    private Integer age;

    public User() {
    }

    public User(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
