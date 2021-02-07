package cn.st.dao;

import cn.st.domain.User;

import java.io.IOException;
import java.util.List;

/**
 * @description:
 * @author: st
 * @create: 2021-02-07 09:18
 **/

public interface UserMapper {
    public List<User> findAll() throws IOException;
    public User findById(int id);
}
