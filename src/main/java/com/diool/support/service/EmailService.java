package com.diool.support.service;

import com.diool.support.model.EmailDetail;
import org.springframework.stereotype.Service;

@Service
public interface EmailService {


    String sendSimpleMail(EmailDetail details);

}
