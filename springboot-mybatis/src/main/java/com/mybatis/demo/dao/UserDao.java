package com.mybatis.demo.dao;

import com.mybatis.demo.entity.UserDomain;

import java.util.List;

public interface UserDao {


    int insert(UserDomain record);



    List<UserDomain> selectUsers();
}
