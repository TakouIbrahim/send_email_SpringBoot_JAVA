package com.diool.support.service.impl;

import com.diool.support.model.Message;
import com.diool.support.repo.MessageRepository;
import com.diool.support.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private final MessageRepository messageRepo;

    public MessageServiceImpl(MessageRepository messageRepo){
        this.messageRepo = messageRepo;

    }

    @Override
    public Message saveMessage(Message message) {
        return messageRepo.save(message);
    }

    @Override
    public List<Message> listMessage() {
        return (List<Message>) messageRepo.findAll();
    }

    @Override
    public List<Message> searchTransactions(Integer number, Integer amount, Date theDate) {
        return messageRepo.findAllByNumberAndAmountAndTheDate(number, amount, theDate);
    }
}
