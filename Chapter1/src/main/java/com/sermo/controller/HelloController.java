package com.sermo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sermo on 2016/10/25.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "hello world";
    }
}
