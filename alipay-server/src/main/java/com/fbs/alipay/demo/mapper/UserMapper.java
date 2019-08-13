package com.fbs.alipay.demo.mapper;

import com.fbs.service.entity.User;
import org.springframework.stereotype.Repository;

//@Repository
public interface UserMapper {
    void insertUser(User user);
}
