package com.demirserkan.kafkastreamspringdemo.controller;

import com.demirserkan.kafkastreamspringdemo.domain.Message;
import com.demirserkan.kafkastreamspringdemo.handler.ProcessorHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessageController {

    private final ProcessorHandler processorHandler;

    @PostMapping("/message")
    public String sendMessage (@RequestParam String message,
                               @RequestParam int messageId){

        Message sendMessage = new Message();
        sendMessage.setMessageContent(message);
        sendMessage.setMessageId(messageId);

        processorHandler.emitSendMessage(sendMessage);

        return message;
    }
}
