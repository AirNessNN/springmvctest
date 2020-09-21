package com.an.demo.common.proxy;

/**
 * @author Airness
 * @email huhaowei16@hotmail.com
 * @date 2020/9/18 3:16 下午
 * @description
 */
public class ProxyTargetImpl implements ProxyTarget {


    @Override
    public void test1(){
        System.out.println("测试代理成功");
    }

    @Override
    public String test2(String str){
        return "你好"+str;
    }
}
