package com.fbs.alipay.demo.service.impl;

import com.fbs.alipay.demo.mapper.MessageMapper;
import com.fbs.service.MessageService;
import com.fbs.service.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;

    @Override
    public void insertMessage(Message message) {

    }

    @Override
    public void updateStatusByUserId(String userId, String status) {

    }
}
