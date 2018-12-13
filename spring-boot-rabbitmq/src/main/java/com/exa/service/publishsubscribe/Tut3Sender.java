package com.exa.service.publishsubscribe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


/**
 * @author 43313
 *
 */
@Service
public class Tut3Sender {
	private static final Logger LOGGER = LoggerFactory.getLogger(Tut3Sender.class);
	
    @Autowired
    private RabbitTemplate template;

    @Autowired
    private FanoutExchange fanout;

    int dots = 0;

    int count = 0;

    //@Scheduled(fixedDelay = 1000, initialDelay = 500)
    public void send(String messageValue) {
    	LOGGER.info("Tut3Sender: send:");
        StringBuilder builder = new StringBuilder(messageValue);
        if (dots++ == 3) {
            dots = 1;
        }
        for (int i = 0; i < dots; i++) {
            builder.append('.');
        }
        builder.append(Integer.toString(++count));
        String message = builder.toString();
        template.convertAndSend(fanout.getName(), "", message);
        LOGGER.info("Tut3Sender: [x] Sent '" + message + "'");
    }
}