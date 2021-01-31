package cn.st.factory;

import cn.st.dao.UserDao;
import cn.st.dao.impl.UserDaoImpl;

/**
 * @description:
 * @author: st
 * @create: 2021-01-30 17:02
 **/

public class DynamicFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
