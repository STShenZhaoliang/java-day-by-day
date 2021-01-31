package cn.st.service.impl;

import cn.st.dao.UserDao;
import cn.st.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: st
 * @create: 2021-01-30 17:01
 **/

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

//    public void setUserDao(UserDao userDao) {
//                this.userDao = userDao;
//            }
    public void save() {
        userDao.save();
//        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao = (UserDao) app.getBean("userDao");
//        userDao.save();
    }
}
