package cn.st.test;

import cn.st.config.SpringCofiguration;
import cn.st.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @description:
 * @author: st
 * @create: 2021-02-01 09:21
 **/

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
@ContextConfiguration(classes = {SpringCofiguration.class})
public class SpringJunitTest {
    @Autowired
    private UserService userService;

    @Autowired
    private DataSource dataSource;

    @Test
    public void test1() throws SQLException {
        userService.save();
        System.out.println(dataSource.getConnection());
    }
}
