package com.exa.config;
/*package com.hexaware.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hexaware.service.workqueues.Tut2Receiver;
import com.hexaware.service.workqueues.Tut2Sender;

*//**
 * @author 43313
 *
 *//*
@Configuration
public class Tut2Config {

    //@Bean(name="workQueues")
    @Bean
    public Queue workqueues() {
        return new Queue("workqueues");
    }

    
    private static class ReceiverConfig {

        @Bean
        public Tut2Receiver receiver1() {
            return new Tut2Receiver(1);
        }

        @Bean
        public Tut2Receiver receiver2() {
            return new Tut2Receiver(2);
        }
    }

   
    @Bean
    public Tut2Sender sender() {
        return new Tut2Sender();
    }
}
*/