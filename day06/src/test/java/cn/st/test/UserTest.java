package cn.st.test;

import cn.st.dao.UserDao;
import cn.st.dao.impl.UserDaoImpl;
import cn.st.domain.User;
import org.junit.Test;

import java.util.List;

/**
 * @description:
 * @author: st
 * @create: 2021-01-28 16:49
 **/

public class UserTest {
    @Test
    public void findAll() throws Exception{
        UserDao userDao = new UserDaoImpl();
        List<User> list = userDao.findAll();
        for (User user : list) {
            System.out.println(user.getUsername());
        }
    }
}
