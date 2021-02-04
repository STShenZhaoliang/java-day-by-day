package cn.st.controller;

import cn.st.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: st
 * @create: 2021-02-04 14:18
 **/

public class AccountController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = app.getBean(AccountService.class);
        accountService.transfer("st11","st12",500);

    }
}
