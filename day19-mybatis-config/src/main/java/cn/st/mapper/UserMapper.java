package cn.st.mapper;

import cn.st.domain.User;

import java.util.List;

/**
 * @description:
 * @author: st
 * @create: 2021-02-07 11:42
 **/

public interface UserMapper {
    public List<User> findAll();
    public User findById(int id);
    public void save(User user);
}
