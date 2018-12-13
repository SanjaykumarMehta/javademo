package com.exa.service.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.exa.utils.ApplicationUtil;

/**
 * @author 43313
 *
 */
@RabbitListener(queues = "hello")
@Service
public class Tut1Receiver {	
	private static final Logger LOGGER = LoggerFactory.getLogger(Tut1Receiver.class);
	
    @RabbitHandler
    @RabbitListener(queues = "hello")
    public void receive(String in) {
    	 LOGGER.info("Tut1Receiver: Recived message: "+ in);
    	ApplicationUtil.setTut1Message("Recived message: "+ in);    	 
    }
}