package com.demirserkan.kafkastreamspringdemo.configuration;

import com.demirserkan.kafkastreamspringdemo.domain.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.EmitterProcessor;
import reactor.core.publisher.Flux;

import java.util.function.Supplier;

@Configuration
public class SendMessageKafkaStreamSupplierConfuguration {

    @Bean
    public EmitterProcessor<Message> sendMessageProcessor(){
        return EmitterProcessor.create();
    }

    @Bean
    public Supplier<Flux<Message>> sendMessageSupplier (){
        return this::sendMessageProcessor;
    }
}
