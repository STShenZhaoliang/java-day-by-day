package cn.st.service.impl;

import cn.st.service.HelloService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: st
 * @create: 2021-02-24 13:53
 **/

//@Service(interfaceClass = HelloService.class,protocol = "dubbo") //发布服务必须使用Dubbo提供的Service注解
//@Transactional

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "8081 hello" + name;
    }
}
