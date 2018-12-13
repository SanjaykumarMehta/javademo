package com.exa.service.publishsubscribe;

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
public class Tut3Receiver {
	private static final Logger LOGGER = LoggerFactory.getLogger(Tut3Receiver.class);
	
    @RabbitListener(queues = "#{pubSubQueue1.name}")
    public void receive1(String in) throws InterruptedException {
    	LOGGER.info("Tut3Receiver: receive pubSubQueue1:");
    	ApplicationUtil.setPubSubQueue1Message(in); 
        receive(in, 1);
    }

    @RabbitListener(queues = "#{pubSubQueue2.name}")
    public void receive2(String in) throws InterruptedException {
    	LOGGER.info("Tut3Receiver: receive pubSubQueue2:");
    	ApplicationUtil.setPubSubQueue2Message(in); 
        receive(in, 2);
    }

    public void receive(String in, int receiver) throws InterruptedException {
    	LOGGER.info("Tut3Receiver: receive:"+receiver);
        StopWatch watch = new StopWatch();
        watch.start();
        LOGGER.info("Tut3Receiver: instance " + receiver + " [x] Received '" + in + "'");
        doWork(in);
        watch.stop();
        LOGGER.info("Tut3Receiver: instance " + receiver + " [x] Done in "
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
