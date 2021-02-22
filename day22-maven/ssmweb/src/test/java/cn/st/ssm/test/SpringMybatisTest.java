package cn.st.ssm.test;

import cn.st.ssm.pojo.Item;
import cn.st.ssm.service.ItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description:
 * @author: st
 * @create: 2021-02-22 15:23
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-dao.xml","classpath:applicationContext-service.xml"})
public class SpringMybatisTest {
    @Autowired
    public ItemService itemService;

    @Test
    public void test1(){
        Item item = itemService.findById(1);
        System.out.println(item);
    }
}
