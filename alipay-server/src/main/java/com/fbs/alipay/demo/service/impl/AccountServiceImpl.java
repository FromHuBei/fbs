package com.fbs.alipay.demo.service.impl;

import com.fbs.alipay.demo.mapper.AccountMapper;
import com.fbs.service.AccountService;
import com.fbs.service.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void insertAccount(Account account) {
        accountMapper.insertAccount(account);
    }

    @Override
    public void updateStatusByUserId(String userId, String status) {

    }
}
