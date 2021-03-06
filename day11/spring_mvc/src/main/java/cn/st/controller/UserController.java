package cn.st.controller;

import cn.st.domain.User;
import cn.st.domain.VO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: st
 * @create: 2021-02-01 18:01
 **/

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value="/q23")
    @ResponseBody
    public void save23(String username, MultipartFile[] uploadFile) throws IOException {
        System.out.println(username);
        for (MultipartFile multipartFile : uploadFile) {
            String originalFilename = multipartFile.getOriginalFilename();
            multipartFile.transferTo(new File("/Users/air/Desktop/"+originalFilename));
        }
    }

    @RequestMapping(value="/q22")
    @ResponseBody
    public void save22(String username, MultipartFile uploadFile,MultipartFile uploadFile2) throws IOException {
        System.out.println(username);
        //获得上传文件的名称
        String originalFilename = uploadFile.getOriginalFilename();
        uploadFile.transferTo(new File("/Users/air/Desktop/"+originalFilename));
        String originalFilename2 = uploadFile2.getOriginalFilename();
        uploadFile2.transferTo(new File("/Users/air/Desktop/"+originalFilename2));
    }


    @RequestMapping(value="/q21")
    @ResponseBody
    public void save21(@CookieValue(value = "JSESSIONID") String jsessionId) throws IOException {
        System.out.println(jsessionId);
    }

    @RequestMapping(value="/q20")
    @ResponseBody
    public void save20(@RequestHeader(value = "User-Agent",required = false) String user_agent) throws IOException {
        System.out.println(user_agent);
    }


    @RequestMapping(value="/q19")
    @ResponseBody
    public void save19(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException {
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
    }

    @RequestMapping(value="/q18")
    @ResponseBody
    public void save18(Date date) throws IOException {
        System.out.println(date);
    }

    // localhost:8080/user/q17/zhangsan
    @RequestMapping(value="/q17/{name}")
    @ResponseBody
    public void save17(@PathVariable(value="name") String username) throws IOException {
        System.out.println(username);
    }

    @RequestMapping(value="/q16")
    @ResponseBody
    public void save16(@RequestParam(value="name",required = false,defaultValue = "st") String username) throws IOException {
        System.out.println(username);
    }

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
