package cn.st.demo;

import cn.st.service.UserService;
import cn.st.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @description:
 * @author: st
 * @create: 2021-01-30 16:53
 **/

public class UserController {
    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//        userService.save();
//        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext app = new FileSystemXmlApplicationContext("/Users/air/gitee/java-day-by-day/day08/src/main/resources/applicationContext.xml");

        ApplicationContext app = new FileSystemXmlApplicationContext("//Users//air//gitee//java-day-by-day//day08//src//main//resources//applicationContext.xml");
//        UserService userService = (UserService) app.getBean("userService");
//        userService.save();

        app.getBean(UserService.class)
    }
}
