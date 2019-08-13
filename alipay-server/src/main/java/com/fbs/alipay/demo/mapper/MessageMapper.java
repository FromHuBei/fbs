package com.fbs.alipay.demo.mapper;

import com.fbs.alipay.demo.entity.Message;
import org.springframework.stereotype.Repository;
@Repository
public interface MessageMapper {
    void insertMessage(Message message);
}
