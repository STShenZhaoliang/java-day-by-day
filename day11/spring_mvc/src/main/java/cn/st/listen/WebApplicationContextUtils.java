package cn.st.listen;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

/**
 * @description:
 * @author: st
 * @create: 2021-02-01 16:30
 **/

public class WebApplicationContextUtils {
    public static ApplicationContext getWebApplicationContext(ServletContext servletContext){
        return (ApplicationContext) servletContext.getAttribute("app");
    }

}
