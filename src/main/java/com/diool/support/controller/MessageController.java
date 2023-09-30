package com.diool.support.controller;

import com.diool.support.controller.api.MessageControllerApi;
import com.diool.support.model.Message;
import com.diool.support.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController implements MessageControllerApi {

    @Autowired
    private MessageService messageService;

    @Override
    public Message saveMessage(Message message) {
        return messageService.saveMessage(message);
    }

    @Override
    public List<Message> listMessage() {
        return messageService.listMessage();
    }

    @Override
    public List<Message> searchTransaction(Message message) {
        return messageService.searchTransactions(message.getNumber(), message.getAmount(), message.getTheDate());

    }
}
