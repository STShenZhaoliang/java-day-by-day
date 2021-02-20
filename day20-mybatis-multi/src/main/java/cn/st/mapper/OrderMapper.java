package cn.st.mapper;

import cn.st.domain.Order;

import java.util.List;

/**
 * @description:
 * @author: st
 * @create: 2021-02-07 15:53
 **/

public interface OrderMapper {
    //查询全部的方法
    public List<Order> findAll();
}
