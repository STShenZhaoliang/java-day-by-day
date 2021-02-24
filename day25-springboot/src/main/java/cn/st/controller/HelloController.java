package cn.st.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: st
 * @create: 2021-02-24 17:05
 **/

@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello(){
        return "Hello, spring boot";
    }
}
