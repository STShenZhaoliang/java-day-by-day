package druid;

import util.JDBCTools;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @description: DruidDemo2
 * @author: st
 * @create: 2021-01-24 15:39
 **/

public class DruidDemo2 {

    public static void main(String[] args) {
        /*
         * 完成添加操作：给account表添加一条记录
         */
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            //1.获取连接
            conn = JDBCTools.getConnection();
            //2.定义sql
            String sql = "insert into account values(null,?,?)";
            //3.获取pstmt对象
            pstmt = conn.prepareStatement(sql);
            //4.给？赋值
            pstmt.setString(1,"哈哈哈");
            pstmt.setDouble(2,3000);
            //5.执行sql
            int count = pstmt.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //6. 释放资源
            JDBCTools.close(pstmt,conn);
        }
    }

}
