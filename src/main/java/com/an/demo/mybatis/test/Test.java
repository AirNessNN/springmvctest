package com.an.demo.mybatis.test;

import com.an.demo.mybatis.test.dao.RoleDao;
import com.an.demo.mybatis.test.entity.RoleEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Airness
 * @email huhaowei16@hotmail.com
 * @date 2020/10/16 9:57 下午
 * @description
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        RoleDao roleDao = (RoleDao) context.getBean("roleDao");

        roleDao.insertRole(new RoleEntity(null,"adad","asdasd"));
        throw new RuntimeException();
    }
}
