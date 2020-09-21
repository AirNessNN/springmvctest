package com.an.demo.course;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Airness
 * @email huhaowei16@hotmail.com
 * @date 2020/9/14 4:35 下午
 * @description
 */
public class Test {


    public void sayHello(String str){
        System.out.println("你好:" + str);
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> tc = Class.forName("com.an.demo.course.Test");
        Constructor<?> constructor=tc.getConstructor();
        Object instance = constructor.newInstance();

        Method method = tc.getMethod("sayHello", String.class);
        method.invoke(instance,"张三");
    }
}
