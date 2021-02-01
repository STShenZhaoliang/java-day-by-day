package cn.st.anno;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: st
 * @create: 2021-02-01 09:58
 **/

@Component("target")
public class Target implements TargetInterface{
    @Override
    public void save() {
        System.out.println("save running.....");
    }
}
