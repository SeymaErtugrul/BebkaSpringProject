package com.example.BebkaSpringProject.service;

import com.example.BebkaSpringProject.MessagePrinter;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

   private final MessagePrinter messagePrinter;
  public MessageService(MessagePrinter messagePrinter)
    {
        this.messagePrinter = messagePrinter;
    }

    public void sendMessage() {
        messagePrinter.printMessage();
    }
}
