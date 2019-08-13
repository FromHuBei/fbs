package com.mybatis.demo.service;

import com.github.pagehelper.PageInfo;
import com.mybatis.demo.entity.UserDomain;

public interface UserService {
    int addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}
