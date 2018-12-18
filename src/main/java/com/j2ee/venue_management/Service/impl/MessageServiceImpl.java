package com.j2ee.venue_management.Service.impl;

import com.j2ee.venue_management.DO.Message;
import com.j2ee.venue_management.Repository.MessageRepository;
import com.j2ee.venue_management.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @param: none
 * @description: 用于实现Service层
 * @author: YQ
 * @create: 2018-12-9
 **/
@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepository MessageRepository;

    @Override
    public Message findOne(Integer id){return MessageRepository.findById(id).get();};

    @Override
    public Message createMessage(Message message){
        return MessageRepository.save(message);
    }

    @Override
    public void deleteMessageById(Integer id){
        MessageRepository.deleteById(id);
    }

}
