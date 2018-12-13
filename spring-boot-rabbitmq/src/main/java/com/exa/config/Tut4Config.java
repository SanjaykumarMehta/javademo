package com.exa.config;

import org.springframework.amqp.core.AnonymousQueue;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.exa.service.routing.Tut4Receiver;
import com.exa.service.routing.Tut4Sender;

/**
 * @author 43313
 *
 */
@Configuration
public class Tut4Config {

    @Bean
    public DirectExchange direct() {
        return new DirectExchange("tut.direct");
    }
    
        private static class ReceiverConfig {

        @Bean
        public Queue routingQueue1() {
            return new AnonymousQueue();
        }

        @Bean
        public Queue routingQueue2() {
            return new AnonymousQueue();
        }

        @Bean
        public Binding binding1a(DirectExchange direct, 
            Queue routingQueue1) {
            return BindingBuilder.bind(routingQueue1)
                .to(direct)
                .with("orange");
        }

        @Bean
        public Binding binding1b(DirectExchange direct, 
            Queue routingQueue1) {
            return BindingBuilder.bind(routingQueue1)
                .to(direct)
                .with("black");
        }

        @Bean
        public Binding binding2a(DirectExchange direct,
            Queue routingQueue2) {
            return BindingBuilder.bind(routingQueue2)
                .to(direct)
                .with("green");
        }

        @Bean
        public Binding binding2b(DirectExchange direct, 
            Queue routingQueue2) {
            return BindingBuilder.bind(routingQueue2)
                .to(direct)
                .with("black");
        }

        @Bean
        public Tut4Receiver receiver() {
            return new Tut4Receiver();
        }
    }

    @Bean
    public Tut4Sender sender() {
        return new Tut4Sender();
    }
}
