package cn.st.dao.impl;

import cn.st.dao.AccountDao;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @description:
 * @author: st
 * @create: 2021-02-04 14:08
 **/

public class AccountDaoImpl implements AccountDao {
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void out(String outMan, int balance) {
        jdbcTemplate.update("update account set balance=balance-? where name=?",balance,outMan);
    }

    @Override
    public void in(String inMan, int balance) {
        jdbcTemplate.update("update account set balance=balance+? where name=?",balance,inMan);
    }
}
