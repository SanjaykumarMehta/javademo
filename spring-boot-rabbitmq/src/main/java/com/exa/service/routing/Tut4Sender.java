package com.exa.service.routing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


/**
 * @author 43313
 *
 */
@Service
public class Tut4Sender {
	private static final Logger LOGGER = LoggerFactory.getLogger(Tut4Sender.class);
	
    @Autowired
    private RabbitTemplate template;

    @Autowired
    private DirectExchange direct;

    private int index;

    private int count;

    private final String[] keys = {"orange", "black", "green"};

   // @Scheduled(fixedDelay = 1000, initialDelay = 500)
    public void send(String messageValue) {
    	LOGGER.info("Tut4Sender: send:");
        StringBuilder builder = new StringBuilder(messageValue);
        if (++this.index == 3) {
            this.index = 0;
        }
        String key = keys[this.index];
        builder.append(key).append(' ');
        builder.append(Integer.toString(++this.count));
        String message = builder.toString();
        template.convertAndSend(direct.getName(), key, message);
        LOGGER.info("Tut4Sender: [x] Sent '" + message + "'");
    }
}
