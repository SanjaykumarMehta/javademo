package com.exa.service.rpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.exa.utils.ApplicationUtil;

/**
 * @author 43313
 *
 */
@Service
public class Tut6Client {
	private static final Logger LOGGER = LoggerFactory.getLogger(Tut6Client.class);
	
    @Autowired
    private RabbitTemplate template;

    @Autowired
    private DirectExchange exchange;   

   // @Scheduled(fixedDelay = 1000, initialDelay = 500)
    public void send(int n) {
    	LOGGER.info("Tut6Client: [x] Requesting fib(" + n + ")");
        Integer response = (Integer) template.convertSendAndReceive
            (exchange.getName(), "rpc", n);
        LOGGER.info("Tut6Client: [.] Got '" + response + "'");     
        
        ApplicationUtil.setRpcMessage(response.toString());
    }
}