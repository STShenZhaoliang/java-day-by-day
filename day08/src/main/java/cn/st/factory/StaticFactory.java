package cn.st.factory;

import cn.st.dao.UserDao;
import cn.st.dao.impl.UserDaoImpl;

/**
 * @description:
 * @author: st
 * @create: 2021-01-30 17:05
 **/

public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
