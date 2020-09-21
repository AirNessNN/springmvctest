package com.an.demo.mybatis.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Airness
 * @email huhaowei16@hotmail.com
 * @date 2020/9/21 4:27 下午
 * @description
 */
@Data
@AllArgsConstructor
public class RoleEntity {
    private Integer id;
    private String roleName;
    private String note;
}
