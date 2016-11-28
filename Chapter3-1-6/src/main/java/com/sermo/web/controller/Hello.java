package com.sermo.web.controller;

import com.sermo.web.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sermo
 * @version 2016/11/28.
 */
@Controller
public class Hello {
    @RequestMapping(value = "/hello")
    public String hello() throws Exception{
        throw new Exception("hello error");
    }

    @RequestMapping(value = "json")
    public String json() throws MyException{
        throw new MyException("json error");
    }
}
