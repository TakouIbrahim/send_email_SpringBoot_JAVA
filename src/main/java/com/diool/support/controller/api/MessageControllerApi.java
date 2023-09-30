package com.diool.support.controller.api;

import com.diool.support.model.Message;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value= "/api/v1")
public interface MessageControllerApi {

    @PostMapping(value= "/message/save", produces = "application/json", consumes = "application/json")
    Message saveMessage(@RequestBody Message message);


    @GetMapping(value ="/messages")
    List<Message> listMessage();


    @PutMapping(value = "/searchTransaction", produces = "application/json", consumes = "application/json")
    List<Message> searchTransaction(@RequestBody Message message);
}
