package com.j2ee.venue_management.Service;

import com.j2ee.venue_management.DO.Message;

public interface MessageService {

    Message findOne(Integer id);

    Message createMessage(Message message);

    void deleteMessageById(Integer id);
}
