package com.rabbit.service;

import java.util.concurrent.TimeUnit;

import com.rabbit.service.Reciever;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rabbit.configuration.RecieverConfiguration;
@Component
public class Runner implements CommandLineRunner{

	
	private final RabbitTemplate rabbitTemplate;
    private final Reciever receiver;
    
    public Runner(Reciever receiver, RabbitTemplate rabbitTemplate) {
 
        this.receiver = receiver;
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Sending message...");
        rabbitTemplate.convertAndSend(RecieverConfiguration.topicExchangeName, "key", "Hello from RabbitMQ!");
        receiver.getLatch().await(1000, TimeUnit.MILLISECONDS);
    }
}
