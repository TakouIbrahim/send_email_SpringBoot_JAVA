package com.diool.support.service;

import com.diool.support.model.Message;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface MessageService {

    Message saveMessage(Message Message);

    List<Message> listMessage();

    List<Message> searchTransactions(Integer number, Integer amount, Date theDate);
}
