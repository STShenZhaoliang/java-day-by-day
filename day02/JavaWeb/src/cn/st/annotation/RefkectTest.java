package cn.st.annotation;

import java.lang.reflect.Method;

/**
 * @description: RefkectTest
 * @author: st
 * @create: 2021-01-24 09:41
 **/

@Pro(className ="cn.st.annotation.Demo1",methodName ="show" )
public class RefkectTest {
    public static void main(String[] args) throws Exception {
        Class cl=RefkectTest.class;
        Pro pro= (Pro) cl.getAnnotation(Pro.class);
        String className=pro.className();
        String methodName=pro.methodName();
        System.out.println(className+"111111");
        System.out.println(methodName+"22222");

        Class demo1=Class.forName(className);
        Method show=demo1.getMethod(methodName);
        Object o=demo1.newInstance();
        show.invoke(o);
    }
}