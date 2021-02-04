package cn.st.dao.impl;

import cn.st.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: st
 * @create: 2021-02-04 14:08
 **/

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void out(String outMan, int balance) {
        jdbcTemplate.update("update account set balance=balance-? where name=?",balance,outMan);
    }

    @Override
    public void in(String inMan, int balance) {
        jdbcTemplate.update("update account set balance=balance+? where name=?",balance,inMan);
    }
}
