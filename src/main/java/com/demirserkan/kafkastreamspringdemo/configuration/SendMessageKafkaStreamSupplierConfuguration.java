package com.demirserkan.kafkastreamspringdemo.configuration;

import com.demirserkan.kafkastreamspringdemo.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

import java.util.function.Supplier;

@Configuration
public class SendMessageKafkaStreamSupplierConfuguration {

    @Autowired
    private Sinks.Many<Message> sendMessageProcessor;

    @Bean
    public Supplier<Flux<Message>> sendMessageSupplier() {
        return () -> sendMessageProcessor.asFlux();
    }
}
