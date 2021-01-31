package cn.st.test;

import cn.st.dao.UserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: st
 * @create: 2021-01-30 17:24
 **/

public class SpringTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) app.getBean("userDao");
        System.out.println(userDao1);

        UserDao userDao2 = (UserDao) app.getBean("userDao");
        System.out.println(userDao2);
        app.close();
    }
}
