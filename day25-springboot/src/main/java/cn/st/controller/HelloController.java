package cn.st.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;


/**
 * @description:
 * @author: st
 * @create: 2021-02-24 17:05
 **/

@RestController
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("hello")
    public String hello(){
        System.out.println(" DataSource = " + dataSource);
        return "Hello, spring boot123";
    }
}
