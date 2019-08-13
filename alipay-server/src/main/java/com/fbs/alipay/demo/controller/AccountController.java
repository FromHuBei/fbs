package com.fbs.alipay.demo.controller;

import com.fbs.service.AccountService;
import com.fbs.service.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping(value = "/account/api")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    private String insert(Account account){
        account.setAccountId(1);
        account.setAmount(1.0);
        account.setUserId(UUID.randomUUID().toString());
        accountService.insertAccount(account);
        return "ok";
    }
}
