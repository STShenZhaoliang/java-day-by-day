package cn.st.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description:
 * @author: st
 * @create: 2021-02-01 18:01
 **/

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value="/q2")
    public ModelAndView save2(){
        /*
            Model:模型 作用封装数据
            View：视图 作用展示数据
         */
        ModelAndView modelAndView = new ModelAndView();
        //设置模型数据
        modelAndView.addObject("un","st");
        //设置视图名称
        modelAndView.setViewName("success");
        return modelAndView;
    }

//    @RequestMapping("/quick")
    // 请求地址  http://localhost:8080/user/quick
    @RequestMapping(value="/quick",method = RequestMethod.GET,params = {"username"})
    public String save(){
        System.out.println("Controller save running....");
        return "success";
    }

}
