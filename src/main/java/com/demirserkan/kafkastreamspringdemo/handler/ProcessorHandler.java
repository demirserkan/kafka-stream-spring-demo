package com.demirserkan.kafkastreamspringdemo.handler;

import com.demirserkan.kafkastreamspringdemo.domain.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Sinks;

@Component
@Slf4j
@RequiredArgsConstructor
public class ProcessorHandler {

    private final Sinks.Many<Message> sendMessageProcessor;

    public void emitSendMessage (Message message){
        log.info("[emitSendMessage()] started :: {}", message);

        sendMessageProcessor.tryEmitNext(message);

        log.info("[emitSendMessage()] finished :: {}", message);
    }
}
