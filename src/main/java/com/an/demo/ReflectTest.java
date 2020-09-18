package com.an.demo;

import com.an.demo.common.reflect.ReflectTarget;
import com.an.demo.common.reflect.ReflectTargetImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Airness
 * @email huhaowei16@hotmail.com
 * @date 2020/9/18 3:16 下午
 * @description
 */
public class ReflectTest {

    public static void main(String[] args) {

        ReflectTarget target = new ReflectTargetImpl();

        InvocationHandler handler = (proxy, method, args1) -> {
            System.out.println("代理方法："+method.getName()+"即将执行");
            Object o = method.invoke(target, args1);
            System.out.println("代理方法："+method.getName()+"执行完成");
            return o;
        };

        ReflectTarget proxyTarget = (ReflectTarget) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),handler);
        proxyTarget.test1();
        String str = proxyTarget.test2("哈哈哈");
        System.out.println("test2 = "+str);
    }
}
