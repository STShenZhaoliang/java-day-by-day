package cn.st.service.impl;

import cn.st.dao.UserDao;
import cn.st.service.UserService;

/**
 * @description:
 * @author: st
 * @create: 2021-02-01 14:40
 **/

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }
}
