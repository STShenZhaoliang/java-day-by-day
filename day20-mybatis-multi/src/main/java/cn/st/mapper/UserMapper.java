package cn.st.mapper;

import cn.st.domain.User;

import java.util.List;

/**
 * @description:
 * @author: st
 * @create: 2021-02-07 15:54
 **/

public interface UserMapper {
    public List<User> findAll();

    public List<User> findUserAndRoleAll();
}
