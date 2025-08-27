package com.example.BebkaSpringProject.controller;

import com.example.BebkaSpringProject.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/message")
    public String printMessage() {
        messageService.sendMessage();
        return "Mesaj gönderildi!";
    }
}
