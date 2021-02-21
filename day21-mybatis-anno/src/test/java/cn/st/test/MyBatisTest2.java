package cn.st.test;

import cn.st.domain.Order;
import cn.st.mapper.OrderMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest2 {

    private OrderMapper mapper;

    @Before
    public void before() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        mapper = sqlSession.getMapper(OrderMapper.class);
    }


    @Test
    public void testSave(){
//        List<Order> all = mapper.findAll();
//        for (Order order : all) {
//            System.out.println(order);
//        }

        var all1 = mapper.findAll();
        for (var order:
             all1) {
            System.out.println(order);;
        }
    }



}
