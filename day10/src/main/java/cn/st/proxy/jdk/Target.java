package cn.st.proxy.jdk;

/**
 * @description:
 * @author: st
 * @create: 2021-02-01 10:13
 **/

public class Target implements TargetInterface {
    public void save() {
        System.out.println("save running.....");
    }
}
