package com.an.demo.mybatis.test.common;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Airness
 * @email huhaowei16@hotmail.com
 * @date 2020/9/21 4:19 下午
 * @description
 */
public class MySqlSessionFactory{

    private SqlSessionFactory sessionFactory;


    public MySqlSessionFactory(){
        try {
            init();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void init() throws IOException {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        InputStream in = Resources.getResourceAsStream("mybatis-configuration.xml");
        sessionFactory = builder.build(in);
    }

    public SqlSession getSession(){
        if (sessionFactory == null){
            try {
                init();
            } catch (IOException e) {
                throw new RuntimeException("无法初始化Mybatis");
            }
        }
        return sessionFactory.openSession();
    }
}
