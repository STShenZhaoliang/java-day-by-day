package cn.st.ssm.service;

import cn.st.ssm.dao.ItemMapper;
import cn.st.ssm.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: st
 * @create: 2021-02-22 11:46
 **/

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public Item findById(int id) {
        return itemMapper.findById(id);
    }
}
