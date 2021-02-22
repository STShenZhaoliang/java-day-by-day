package cn.st.ssm.dao;

import cn.st.ssm.pojo.Item;

/**
 * @description:
 * @author: st
 * @create: 2021-02-22 11:44
 **/

public interface ItemMapper {
    public Item findById(int id);
}
