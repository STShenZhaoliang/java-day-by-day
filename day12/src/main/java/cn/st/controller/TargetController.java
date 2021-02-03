package cn.st.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description:
 * @author: st
 * @create: 2021-02-03 15:28
 **/

@Controller
public class TargetController {
    @RequestMapping("/t")
    public ModelAndView show(){
        System.out.println("目标资源执行......");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "st");
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
