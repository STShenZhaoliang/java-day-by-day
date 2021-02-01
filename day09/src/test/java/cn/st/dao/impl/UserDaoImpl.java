package cn.st.dao.impl;

import cn.st.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: st
 * @create: 2021-01-31 15:12
 **/
//<bean id="userDao" class="cn.st.dao.impl.UserDaoImpl"></bean>
//@Component("userDao")
    @Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("save running ....");
    }
}
