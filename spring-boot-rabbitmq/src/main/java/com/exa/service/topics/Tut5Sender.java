package com.exa.service.topics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;



/**
 * @author 43313
 *
 */
@Service
public class Tut5Sender {
	private static final Logger LOGGER = LoggerFactory.getLogger(Tut5Sender.class);
	
    @Autowired
    private RabbitTemplate template;

    @Autowired
    private TopicExchange topic;


    private int index;

    private int count;

    private final String[] keys = {"quick.orange.rabbit", 
            "lazy.orange.elephant", "quick.orange.fox",
            "lazy.brown.fox", "lazy.pink.rabbit", "quick.brown.fox"};

   // @Scheduled(fixedDelay = 1000, initialDelay = 500)
    public void send(String messageValue) {
    	LOGGER.info("Tut5Sender: send:");
        StringBuilder builder = new StringBuilder(messageValue);
        if (++this.index == keys.length) {
            this.index = 0;
        }
        String key = keys[this.index];
        builder.append(key).append(' ');
        builder.append(Integer.toString(++this.count));
        String message = builder.toString();
        template.convertAndSend(topic.getName(), key, message);
        LOGGER.info("Tut5Sender:  [x] Sent '" + message + "'");
    }

}
