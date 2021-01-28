package cn.st.dao;

import cn.st.domain.User;

import java.util.List;

/**
 * @description:
 * @author: st
 * @create: 2021-01-28 16:45
 **/

public interface UserDao {
    public List<User> findAll() throws Exception;
}
