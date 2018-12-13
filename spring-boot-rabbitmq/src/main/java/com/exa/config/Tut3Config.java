package com.exa.config;

import org.springframework.amqp.core.AnonymousQueue;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.exa.service.publishsubscribe.Tut3Receiver;
import com.exa.service.publishsubscribe.Tut3Sender;

/**
 * @author 43313
 *
 */
@Configuration
public class Tut3Config {

    @Bean
    public FanoutExchange fanout() {
        return new FanoutExchange("tut.fanout");
    }

     private static class ReceiverConfig {

        @Bean
        public Queue pubSubQueue1() {
            return new AnonymousQueue();
        }

        @Bean
        public Queue pubSubQueue2() {
            return new AnonymousQueue();
        }

        @Bean
        public Binding binding1(FanoutExchange fanout,
            Queue pubSubQueue1) {
            return BindingBuilder.bind(pubSubQueue1).to(fanout);
        }

        @Bean
        public Binding binding2(FanoutExchange fanout,
            Queue pubSubQueue2) {
            return BindingBuilder.bind(pubSubQueue2).to(fanout);
        }

        @Bean
        public Tut3Receiver receiver() {
            return new Tut3Receiver();
        }
    }

    @Bean
    public Tut3Sender sender() {
        return new Tut3Sender();
    }
}