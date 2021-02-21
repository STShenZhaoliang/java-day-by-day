package cn.st.domain;

import java.util.Date;

/**
 * @description:
 * @author: st
 * @create: 2021-02-07 15:40
 **/

public class Order {

    private int id;
    private Date ordertime;
    private double total;

    //当前订单属于哪一个用户
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", ordertime=" + ordertime +
                ", total=" + total +
                ", user=" + user +
                '}';
    }
}

//    CREATE TABLE `orders` (
//        `id` int NOT NULL AUTO_INCREMENT,
//        `ordertime` varchar(255) DEFAULT NULL,
//        `total` double DEFAULT NULL,
//        `uid` int DEFAULT NULL,
//        PRIMARY KEY (`id`),
//        KEY `uid` (`uid`),
//        CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `user` (`id`)
//        ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;