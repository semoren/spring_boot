package com.sermo.web.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author sermo
 * @version 2016/11/29.
 */
@Document(collection = "user")
public class User {

    @Id
    private String id;

    private String userName;

    private Integer age;

    public User() {
    }

    public User(String username, Integer age) {
        this.userName = username;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
