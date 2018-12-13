package com.exa.service.topics;

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
public class Tut5Receiver {
	private static final Logger LOGGER = LoggerFactory.getLogger(Tut5Receiver.class);
	
    @RabbitListener(queues = "#{topicQueue1.name}")
    public void receive1(String in) throws InterruptedException {
    	LOGGER.info("Tut5Receiver: receive1: topicQueue1");
    	ApplicationUtil.setTopicQueue1Message(in); 
        receive(in, 1);
    }

    @RabbitListener(queues = "#{topicQueue2.name}")
    public void receive2(String in) throws InterruptedException {
    	LOGGER.info("Tut5Receiver: receive2: topicQueue2");
    	ApplicationUtil.setTopicQueue2Message(in); 
        receive(in, 2);
    }

    public void receive(String in, int receiver) throws 
        InterruptedException {
    	LOGGER.info("Tut5Receiver: receive:" +receiver);
        StopWatch watch = new StopWatch();
        watch.start();
        LOGGER.info("Tut5Receiver: instance " + receiver + " [x] Received '" 
            + in + "'");
        doWork(in);
        watch.stop();
        LOGGER.info("Tut5Receiver: instance " + receiver + " [x] Done in " 
            + watch.getTotalTimeSeconds() + "s");
    }

    private void doWork(String in) throws InterruptedException {
        for (char ch : in.toCharArray()) {
            if (ch == '.') {
                Thread.sleep(1000);
            }
        }
    }
}