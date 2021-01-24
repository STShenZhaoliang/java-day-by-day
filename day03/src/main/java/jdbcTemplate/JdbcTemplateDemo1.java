package jdbcTemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCTools;

/**
 * @description: JdbcTemplate
 * @author: st
 * @create: 2021-01-24 16:18
 **/

public class JdbcTemplateDemo1 {
    public static void main(String[] args) {
        //1.导入jar包
        //2.创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCTools.getDataSource());
        //3.调用方法
        String sql = "update account set balance = 22323 where id = ?";
        int count = template.update(sql, 4);
        System.out.println(count);
    }
}
