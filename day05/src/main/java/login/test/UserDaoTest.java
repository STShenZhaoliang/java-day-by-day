package login.test;

import login.dao.UserDao;
import login.domain.User;
import org.junit.jupiter.api.Test;

/**
 * @description:
 * @author: st
 * @create: 2021-01-25 14:25
 **/

public class UserDaoTest {
    @Test
    public void testLogin(){
        User loginuser = new User();
        loginuser.setUsername("lisi");
        loginuser.setPassword("234");


        UserDao dao = new UserDao();
        User user = dao.login(loginuser);
        System.out.println(user);
    }
}
