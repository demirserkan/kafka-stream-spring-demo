package com.demirserkan.kafkastreamspringdemo.configuration;

import com.demirserkan.kafkastreamspringdemo.domain.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

import java.util.function.Consumer;

@Configuration
@Slf4j
public class SendMessageKafkaStreamConsumerConfuguration {

    @Bean
    public Consumer<Flux<Message>> sendMessageConsumer (){
        return payload -> log.info("Data received "+payload);
    }
}
