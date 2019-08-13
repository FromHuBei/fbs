package com.fbs.alipay.demo.mapper;

import com.fbs.service.entity.Account;

public interface AccountMapper {

    void insertAccount(Account account);

    void updateAccountByUserId(String userId,String status);
}
