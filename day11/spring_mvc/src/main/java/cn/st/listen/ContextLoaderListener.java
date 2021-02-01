package cn.st.listen;

import cn.st.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @description:
 * @author: st
 * @create: 2021-02-01 16:19
 **/

public class ContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        //读取web.xml中的全局参数
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");
        ApplicationContext app = new ClassPathXmlApplicationContext(contextConfigLocation);
        //将Spring的应用上下文对象存储到ServletContext域中
        servletContext.setAttribute("app",app);
        System.out.println("spring容器创建完毕....");

//        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ServletContext servletContext = sce.getServletContext();
//        servletContext.setAttribute("app",app);
//        System.out.println("spring容器创建完毕....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
