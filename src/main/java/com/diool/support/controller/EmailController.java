package com.diool.support.controller;

import com.diool.support.controller.api.EmailControllerApi;
import com.diool.support.model.EmailDetail;
import com.diool.support.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController implements EmailControllerApi {

    @Autowired private EmailService emailService;

    @Override
    public String sendMail(EmailDetail emailDetail) {

        String status = emailService.sendSimpleMail(emailDetail);
        return status;
    }
}
