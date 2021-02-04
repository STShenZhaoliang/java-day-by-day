package cn.st.domain;

/**
 * @description:
 * @author: st
 * @create: 2021-02-04 09:15
 **/

public class Account {
    private String name;
    private Integer balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
