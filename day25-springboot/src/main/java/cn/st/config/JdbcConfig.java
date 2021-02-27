package cn.st.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

//import javax.sql.DataSource;

/**
 * @description:
 * @author: st
 * @create: 2021-02-24 17:49
 **/

@Configurable
//@PropertySource("classpath:application.properties")
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {
    // 方法一
//        @Value("${jdbc.driverClassName}")
//        String driverClassName;
//
//        @Value("${jdbc.url}")
//        String url;
//
//        @Value("${jdbc.username}")
//        String username;
//
//        @Value("${jdbc.password}")
//        String password;
//
//        @Bean
//        public DataSource dataSource() {
//
//            DruidDataSource dataSource = new DruidDataSource();
//
//
//            System.out.println("0000000000000" + driverClassName);
//            System.out.println("0000000000000" + url);
//            System.out.println("0000000000000" + username);
//            System.out.println("0000000000000" + password);
//            dataSource.setDriverClassName(driverClassName);
//            dataSource.setUrl(url);
//            dataSource.setUsername(username);
//            dataSource.setPassword(password);
//            return dataSource;
//        }


//    @Bean
//    public DataSource dataSource(JdbcProperties jdbcProperties) {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
//        dataSource.setUrl(jdbcProperties.getUrl());
//        dataSource.setUsername(jdbcProperties.getUsername());
//        dataSource.setPassword(jdbcProperties.getPassword());
//        return dataSource;
//    }
//
//
    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource() {
        return new DruidDataSource();
    }

}
