package com.exa.service.workqueues;
///*package com.hexaware.service.workqueues;
//
//import java.util.concurrent.atomic.AtomicInteger;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.amqp.core.Queue;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//*//**
// * @author 43313
// *
// *//*
//@Service
//public class Tut2Sender {
//	private static final Logger LOGGER = LoggerFactory.getLogger(Tut2Sender.class);
//
//    @Autowired
//    private RabbitTemplate template;
//
//    @Autowired
//    private Queue workqueues;
//    
//    AtomicInteger dots = new AtomicInteger(0);
//
//    AtomicInteger count = new AtomicInteger(0);
//   
//
//    //@Scheduled(fixedDelay = 1000, initialDelay = 500)
//    public void send(String messageValue) {
//        StringBuilder builder = new StringBuilder(messageValue);
//        if (dots.incrementAndGet() == 3) {
//            dots.set(1);
//        }
//        for (int i = 0; i < dots.get(); i++) {
//            builder.append('.');
//        }
//        builder.append(count.incrementAndGet());
//        String message = builder.toString();       
//        template.convertAndSend(workqueues.getName(), message);
//        LOGGER.info("Tut2Sender [x] Sent '" + message + "'");
//    }
//}*/