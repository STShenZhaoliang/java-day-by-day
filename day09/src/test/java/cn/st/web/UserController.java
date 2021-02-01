package cn.st.web;

import cn.st.config.SpringCofiguration;
import cn.st.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: st
 * @create: 2021-01-31 17:04
 **/

public class UserController {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringCofiguration.class);
        UserService userService = app.getBean(UserService.class);
        userService.save();
//        app.close();
    }
}
