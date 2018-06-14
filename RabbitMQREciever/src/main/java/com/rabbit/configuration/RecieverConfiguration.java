package com.rabbit.configuration;



import javax.sound.midi.Receiver;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RecieverConfiguration {

	
	public static final String topicExchangeName = "spring-boot-exchange";
	static final String queueName = "Rohan-spring-boot";
	
		@Bean
	    Queue queue() {
	        return new Queue(queueName, false);
	    }
		
		@Bean
	    TopicExchange exchange() {
	        return new TopicExchange(topicExchangeName);
	    }
		
		@Bean
	    Binding binding(Queue queue, TopicExchange exchange) {
		    return BindingBuilder.bind(queue).to(exchange).with("key");
	    }
		
		@Bean
	    SimpleMessageListenerContainer container(ConnectionFactory connectionFactory,
	            MessageListenerAdapter listenerAdapter) {
	      	System.out.println("message listener");
	        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
	        container.setConnectionFactory(connectionFactory);
	        container.setQueueNames(queueName);
	        container.setMessageListener(listenerAdapter);
	        return container;
	    }

	    @Bean
	    MessageListenerAdapter listenerAdapter(Receiver receiver) {
	        return new MessageListenerAdapter(receiver, "receiveMessage");
	    }
		
}
