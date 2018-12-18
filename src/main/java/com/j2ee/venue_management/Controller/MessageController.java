package com.j2ee.venue_management.Controller;

import com.j2ee.venue_management.DO.Message;
import com.j2ee.venue_management.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//前后端交互
/**
 * @param: none
 * @description: Message controller
 * @author: YQ
 * @create: 2018-12-9
 **/
@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/getinfo/{id}")
    public Message MessageList(@PathVariable("id") Integer id){
        return messageService.findOne(id);
    }


}
