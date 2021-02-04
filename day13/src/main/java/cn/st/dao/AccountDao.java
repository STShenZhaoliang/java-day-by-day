package cn.st.dao;

/**
 * @description:
 * @author: st
 * @create: 2021-02-04 14:07
 **/

public interface AccountDao {
    public void out(String outMan, int balance);
    public void in(String inMan, int balance);
}
