package cn.st.service.impl;

import cn.st.dao.AccountDao;
import cn.st.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: st
 * @create: 2021-02-04 14:09
 **/

@Service("accountService")
@Transactional(isolation = Isolation.REPEATABLE_READ)
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public void transfer(String outMan, String inMan, int balance) {
        accountDao.out(outMan,balance);
        accountDao.in(inMan,balance);
    }
}

