package cn.st.controller;

import cn.st.domain.User;
import cn.st.domain.VO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: st
 * @create: 2021-02-01 18:01
 **/

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value="/q15")
    @ResponseBody
    public void save15(@RequestBody List<User> userList) throws IOException {
        System.out.println(userList);
    }

    @RequestMapping(value="/q14")
    @ResponseBody
    public void save14(VO vo) throws IOException {
        System.out.println(vo);
    }

    @RequestMapping(value="/q13")
    @ResponseBody
    public void save13(String[] strs) throws IOException {
        System.out.println(Arrays.asList(strs));
    }

    @RequestMapping(value="/q12")
    @ResponseBody
    public void save12(User user) throws IOException {
        System.out.println(user);
    }

    @RequestMapping(value="/q11")
    @ResponseBody
    public void save11(String username,int age) throws IOException {
        System.out.println(username);
        System.out.println(age);
    }

    @RequestMapping(value="/q10")
    @ResponseBody
    //期望SpringMVC自动将User转换成json格式的字符串
    public User save10() throws IOException {
        User user = new User();
        user.setUsername("q10");
        user.setAge(32);
        return user;
    }

    @RequestMapping(value="/q9")
    @ResponseBody
    public String save9() throws IOException {
        User user = new User();
        user.setUsername("lisi");
        user.setAge(30);
        //使用json的转换工具将对象转换成json格式字符串在返回
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        return json;
    }

    @RequestMapping(value="/q8")
    @ResponseBody
    public String save8() throws IOException {
        return "{\"username\":\"st8\",\"age\":18}";
    }

    @RequestMapping(value="/q7")
    @ResponseBody  //告知SpringMVC框架 不进行视图跳转 直接进行数据响应
    public String save7() throws IOException {
        return "hello st7";
    }

    @RequestMapping(value="/q6")
    public void save6(HttpServletResponse response) throws IOException {
        response.getWriter().print("hello st");
    }

    @RequestMapping(value="/q5")
    public String save5(HttpServletRequest request){
        request.setAttribute("un","st5");
        return "success";
    }

    @RequestMapping(value="/q4")
    public String save4(Model model){
        model.addAttribute("un","st4");
        return "success";
    }

    @RequestMapping(value="/q3")
    public ModelAndView save3(ModelAndView modelAndView){
        modelAndView.addObject("un","st3");
        modelAndView.setViewName("success");
        return modelAndView;
    }

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
