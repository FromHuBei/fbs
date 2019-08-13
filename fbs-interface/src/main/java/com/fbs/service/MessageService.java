package com.fbs.service;

import com.fbs.service.entity.Message;

public interface MessageService {
    void insertMessage(Message message);
    void updateStatusByUserId(String userId,String status);

}
