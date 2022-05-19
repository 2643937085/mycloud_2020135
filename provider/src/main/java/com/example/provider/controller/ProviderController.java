package com.example.provider.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableBinding(Source.class)
public class ProviderController {
        @Autowired
        @Output(Source.OUTPUT)
        private MessageChannel channel;
        @GetMapping("/send")
        public void send(){
            channel.send(MessageBuilder.withPayload("Hello Wrd!").build());
        }

    }
