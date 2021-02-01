package cn.st.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @description:
 * @author: st
 * @create: 2021-01-31 15:15
 **/

//标志该类是Spring的核心配置类
@Configuration
//<context:component-scan base-package="cn.st"/>
@ComponentScan("cn.st")
////<context:property-placeholder location="classpath:jdbc.properties"/>
//@PropertySource("classpath:jdbc.properties")

//<import resource=""/>
@Import({DataSourceConfiguration.class})
public class SpringCofiguration {

//    @Value("${jdbc.driver}")
//    private String driver;
//    @Value("${jdbc.url}")
//    private String url;
//    @Value("${jdbc.username}")
//    private String username;
//    @Value("${jdbc.password}")
//    private String password;
//
//    @Bean("dataSource")  //Spring会将当前方法的返回值以指定名称存储到Spring容器中
//    public DataSource getDataSource() throws PropertyVetoException {
//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        dataSource.setDriverClass(driver);
//        dataSource.setJdbcUrl(url);
//        dataSource.setUser(username);
//        dataSource.setPassword(password);
//        return dataSource;
//    }
}
