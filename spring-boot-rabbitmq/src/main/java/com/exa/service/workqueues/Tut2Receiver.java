package com.exa.service.workqueues;
///*package com.hexaware.service.workqueues;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.amqp.rabbit.annotation.RabbitHandler;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Service;
//import org.springframework.util.StopWatch;
//
//import com.hexaware.utils.ApplicationUtil;
//
//*//**
// * @author 43313
// *
// *//*
//@Service
//@RabbitListener(queues = "workqueues")
//public class Tut2Receiver {
//	private static final Logger LOGGER = LoggerFactory.getLogger(Tut2Receiver.class);
//
//    private final int instance;
//
//    public Tut2Receiver(int i) {
//        this.instance = i;
//    }
//
//    @RabbitHandler
//    public void receive(String in) throws InterruptedException {
//    	StopWatch watch = new StopWatch();
//        watch.start();
//        LOGGER.info("Tut2Receiver:instance " + this.instance +
//            " [x] Received '" + in + "'");
//        doWork(in);
//        watch.stop();
//        LOGGER.info("Tut2Receiver:instance " + this.instance +
//            " [x] Done in " + watch.getTotalTimeSeconds() + "s");
//        
//        ApplicationUtil.setTut2Message("Work Queues Recived message: "+ in); 
//    }
//
//    private void doWork(String in) throws InterruptedException {
//        for (char ch : in.toCharArray()) {
//            if (ch == '.') {
//                Thread.sleep(1000);
//            }
//        }
//    }
//}
//*/