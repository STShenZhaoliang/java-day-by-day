package cn.st.aop;

/**
 * @description:
 * @author: st
 * @create: 2021-02-01 09:59
 **/

public class Target implements TargetInterface{
    @Override
    public void save() {
//        int i = 1/0;
        System.out.println("save running.....");
    }
}
