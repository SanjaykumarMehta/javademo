package com.exa.service.hello;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;



/**
 * @author 43313
 *
 */
@Service
public class Tut1Sender {
	private static final Logger LOGGER = LoggerFactory.getLogger(Tut1Sender.class);
	/*@Autowired
	private AmqpTemplate rabbitTemplate;
	
	@Value("")
	private String exchange;
	
	@Value("")
	private String routingkey;*/
	
    @Autowired
    private RabbitTemplate template;

    @Autowired
    private Queue queue;

    //@Scheduled(fixedDelay = 1000, initialDelay = 500)
    public void send(String message) {        
        template.convertAndSend(queue.getName(), message);
        //rabbitTemplate.convertAndSend(exchange, routingkey, message);
        LOGGER.info("Tut1Sender [x] Sent '" + message + "'");
    }
}