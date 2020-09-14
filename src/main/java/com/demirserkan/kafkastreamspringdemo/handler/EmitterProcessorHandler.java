package com.demirserkan.kafkastreamspringdemo.handler;

import com.demirserkan.kafkastreamspringdemo.domain.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import reactor.core.publisher.EmitterProcessor;

@Component
@Slf4j
@RequiredArgsConstructor
public class EmitterProcessorHandler {

    private final EmitterProcessor<Message> sendMessageProcessor;

    public void emitSendMessage (Message message){
        log.info("[emitSendMessage()] started :: {}", message);

        sendMessageProcessor.onNext(message);

        log.info("[emitSendMessage()] finished :: {}", message);
    }
}
