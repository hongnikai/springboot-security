package com.lc.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * users 表实体类
 * @author lc
 * @create time 2019-07-03
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    private String username;

    @Column(name = "pwd")               //变量名和数据库一致则不需要注解,不一致则需要写注解
    private String password;

    public User(){
    }

    public String getUsername(){
        return username;
    }

}
