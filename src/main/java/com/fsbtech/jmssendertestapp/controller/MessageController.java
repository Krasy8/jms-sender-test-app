package com.fsbtech.jmssendertestapp.controller;

import com.fsbtech.jmssendertestapp.service.MessageSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageSenderService messageSenderService;

    @PostMapping("/send")
    public String sendMessage(@RequestParam String destination, @RequestParam String message) {
        messageSenderService.sendMessage(destination, message);
        return "Message sent to " + destination;
    }
}
