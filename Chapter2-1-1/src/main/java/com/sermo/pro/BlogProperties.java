package com.sermo.pro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by sermo on 2016/10/25.
 */
@Component
@ConfigurationProperties(prefix = "com.sermo.blog")
public class BlogProperties {

    private String name;

    private String title;

    private String value;

    private int number;

    private long bignumber;

    private int test1_10;

    private int test10_20;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public long getBignumber() {
        return bignumber;
    }

    public void setBignumber(long bignumber) {
        this.bignumber = bignumber;
    }

    public int getTest1_10() {
        return test1_10;
    }

    public void setTest1_10(int test1_10) {
        this.test1_10 = test1_10;
    }

    public int getTest10_20() {
        return test10_20;
    }

    public void setTest10_20(int test10_20) {
        this.test10_20 = test10_20;
    }
}
