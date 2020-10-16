package com.an.demo.mybatis.test.dao;

import com.an.demo.mybatis.test.entity.RoleEntity;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Airness
 * @email huhaowei16@hotmail.com
 * @date 2020/9/21 4:45 下午
 * @description
 */
public interface RoleDao {

    @Transactional
    int insertRole(RoleEntity entity);
}
