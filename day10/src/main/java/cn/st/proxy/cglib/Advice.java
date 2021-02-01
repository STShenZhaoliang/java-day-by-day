package cn.st.proxy.cglib;

/**
 * @description:
 * @author: st
 * @create: 2021-02-01 10:04
 **/

public class Advice {
    public void before(){
        System.out.println("前置增强....");
    }

    public void afterReturning(){
        System.out.println("后置增强....");
    }
}
