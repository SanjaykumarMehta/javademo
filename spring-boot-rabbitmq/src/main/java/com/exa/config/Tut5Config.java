package com.exa.config;

import org.springframework.amqp.core.AnonymousQueue;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.exa.service.topics.Tut5Receiver;
import com.exa.service.topics.Tut5Sender;

/**
 * @author 43313
 *
 */
@Configuration
public class Tut5Config {

    @Bean
    public TopicExchange topic() {
        return new TopicExchange("tut.topic");
    }

   private static class ReceiverConfig {

        @Bean
        public Tut5Receiver receiver() {
            return new Tut5Receiver();
        }

        @Bean
        public Queue topicQueue1() {
            return new AnonymousQueue();
        }

        @Bean
        public Queue topicQueue2() {
            return new AnonymousQueue();
        }

        @Bean
        public Binding binding1a(TopicExchange topic, 
            Queue topicQueue1) {
            return BindingBuilder.bind(topicQueue1)
                .to(topic)
                .with("*.orange.*");
        }

        @Bean
        public Binding binding1b(TopicExchange topic, 
            Queue topicQueue1) {
            return BindingBuilder.bind(topicQueue1)
                .to(topic)
                .with("*.*.rabbit");
        }

        @Bean
        public Binding binding2a(TopicExchange topic, 
            Queue topicQueue2) {
            return BindingBuilder.bind(topicQueue2)
                .to(topic)
                .with("lazy.#");
        }

    }

    @Bean
    public Tut5Sender sender() {
        return new Tut5Sender();
    }

}