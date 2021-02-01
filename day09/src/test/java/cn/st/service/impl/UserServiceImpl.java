package cn.st.service.impl;

import cn.st.dao.UserDao;
import cn.st.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @description:
 * @author: st
 * @create: 2021-01-31 15:13
 **/
//<bean id="userService" class="cn.st.service.impl.UserServiceImpl">
//@Component("userService")
    @Service("userService")
//@Scope("prototype")
    @Scope("singleton")
public class UserServiceImpl implements UserService {

//    @Value("st123")
@Value("${jdbc.driver}")
    private String driver;

    //<property name="userDao" ref="userDao"></property>
//    @Autowired //按照数据类型从Spring容器中进行匹配的
    //@Qualifier("userDao")  //是按照id值从容器中进行匹配的 但是主要此处@Qualifier结合@Autowired一起使用
    @Resource(name="userDao") //@Resource相当于@Qualifier+@Autowired

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println(driver);
        userDao.save();
    }

    @PostConstruct
    public void init(){
        System.out.println("Service对象的初始化方法");
    }

    @PreDestroy
    public void destory(){
        System.out.println("Service对象的销毁方法");
    }

}
