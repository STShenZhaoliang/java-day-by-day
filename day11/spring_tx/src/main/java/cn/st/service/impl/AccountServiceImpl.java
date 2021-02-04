package cn.st.service.impl;

import cn.st.dao.AccountDao;
import cn.st.service.AccountService;

/**
 * @description:
 * @author: st
 * @create: 2021-02-04 14:09
 **/

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String outMan, String inMan, int balance) {
        accountDao.out(outMan,balance);
        int i = 1/0;
        accountDao.in(inMan,balance);
    }
}

