package com.fbs.service;

import com.fbs.service.entity.Account;

public interface AccountService {
    void insertAccount(Account account);
    void updateStatusByUserId(String userId,String status);
}
