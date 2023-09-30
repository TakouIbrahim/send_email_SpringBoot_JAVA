package com.diool.support.controller.api;

import com.diool.support.model.EmailDetail;
import com.diool.support.model.Message;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value= "/api/v1")
public interface EmailControllerApi {

    @PostMapping(value= "/sendmail", produces = "application/json", consumes = "application/json")
    String sendMail(@RequestBody EmailDetail emailDetail);
}
