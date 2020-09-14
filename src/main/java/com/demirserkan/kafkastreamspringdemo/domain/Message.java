package com.demirserkan.kafkastreamspringdemo.domain;

import lombok.Data;

@Data
public class Message {
    private int messageId;
    private String messageContent;
}
