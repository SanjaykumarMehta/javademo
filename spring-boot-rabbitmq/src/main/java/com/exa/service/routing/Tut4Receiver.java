package com.exa.service.routing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import com.exa.utils.ApplicationUtil;

/**
 * @author 43313
 *
 */
@Service
public class Tut4Receiver {
	private static final Logger LOGGER = LoggerFactory.getLogger(Tut4Receiver.class);
	
    @RabbitListener(queues = "#{routingQueue1.name}")
    public void receive1(String in) throws InterruptedException {
    	LOGGER.info("Tut4Receiver: receive1: routingQueue1");
    	ApplicationUtil.setRoutingQueue1Message(in); 
        receive(in, 1);
    }

    @RabbitListener(queues = "#{routingQueue2.name}")
    public void receive2(String in) throws InterruptedException {
    	LOGGER.info("Tut4Receiver: receive2: routingQueue2");
    	ApplicationUtil.setRoutingQueue2Message(in); 
        receive(in, 2);
    }

    public void receive(String in, int receiver) throws InterruptedException {
    	LOGGER.info("Tut4Receiver: receive:"+receiver);
        StopWatch watch = new StopWatch();
        watch.start();
        LOGGER.info("Tut4Receiver: instance " + receiver + " [x] Received '" + in + "'");
        doWork(in);
        watch.stop();
        LOGGER.info("Tut4Receiver:instance " + receiver + " [x] Done in " + 
            watch.getTotalTimeSeconds() + "s");
    }

    private void doWork(String in) throws InterruptedException {
        for (char ch : in.toCharArray()) {
            if (ch == '.') {
                Thread.sleep(1000);
            }
        }
    }

}
