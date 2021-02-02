package cn.st.domain;

import java.util.List;

/**
 * @description:
 * @author: st
 * @create: 2021-02-02 17:24
 **/

public class VO {
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "VO{" +
                "userList=" + userList +
                '}';
    }
}
