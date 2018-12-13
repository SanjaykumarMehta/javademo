package com.exa.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.exa.service.hello.Tut1Receiver;
import com.exa.service.hello.Tut1Sender;

/**
 * @author 43313
 *
 */
@Configuration
public class Tut1Config {

	@Bean(name="hello")
    public Queue hello() {
        return new Queue("hello");
    }

    @Bean
    public Tut1Receiver receiver() {
        return new Tut1Receiver();
    }

     @Bean
    public Tut1Sender sender() {
        return new Tut1Sender();
    }
}