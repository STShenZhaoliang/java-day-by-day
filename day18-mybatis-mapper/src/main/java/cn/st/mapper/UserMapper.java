package cn.st.mapper;

import cn.st.domain.User;

import java.util.List;

/**
 * @description:
 * @author: st
 * @create: 2021-02-07 10:22
 **/

public interface UserMapper {
    public List<User> findByCondition(User user);
    public List<User> findByIds(List<Integer> ids);

}
