package com.demirserkan.kafkastreamspringdemo;

import com.demirserkan.kafkastreamspringdemo.domain.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Sinks;

@SpringBootApplication
public class KafkaStreamSpringDemoApplication {

	@Bean
	public Sinks.Many<Message> sendMessageProcessor() {
		return Sinks.many().unicast().onBackpressureBuffer();
	}

	public static void main(String[] args) {
		SpringApplication.run(KafkaStreamSpringDemoApplication.class, args);
	}

}
