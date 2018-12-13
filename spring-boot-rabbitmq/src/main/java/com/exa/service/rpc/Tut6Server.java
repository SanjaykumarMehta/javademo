package com.exa.service.rpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @author 43313
 *
 */
@Service
public class Tut6Server {
	private static final Logger LOGGER = LoggerFactory.getLogger(Tut6Server.class);
	
    @RabbitListener(queues = "tut.rpc.requests")
    // @SendTo("tut.rpc.replies") used when the 
    // client doesn't set replyTo.
    public int fibonacci(int n) {    
    	LOGGER.info("Tut6Server: [x] Received request for " + n);
        int result = fib(n);
        LOGGER.info("Tut6Server: [.] Returned " + result);
        return result;
    }

    public int fib(int n) {
        return n == 0 ? 0 : n == 1 ? 1 : (fib(n - 1) + fib(n - 2));
    }

}
