package com.exa.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.exa.service.hello.Tut1Sender;
import com.exa.service.publishsubscribe.Tut3Sender;
import com.exa.service.routing.Tut4Sender;
import com.exa.service.rpc.Tut6Client;
import com.exa.service.topics.Tut5Sender;
import com.exa.utils.ApplicationConstants;
import com.exa.utils.ApplicationUtil;

/**
 * @author 43313
 *
 */

@Controller
public class ApplicationController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationController.class);
	
	@Autowired
	Tut1Sender tut1Sender;
	
	/*@Autowired
	Tut2Sender tut2Sender;*/
	
	@Autowired
	Tut3Sender tut3Sender;
	
	@Autowired
	Tut4Sender tut4Sender;
	
	@Autowired
	Tut5Sender tut5Sender;
	
	@Autowired
	Tut6Client tut6Client;
	
	//Home Page request
	@RequestMapping(value= {"/", "/homePage"}, method = RequestMethod.GET)
    public String showHomePage(Model model){
		LOGGER.info("ApplicationController: Home Page:");
        return "home";
    }
	
	//Hello World! Message Queue request
	@RequestMapping(value="/hello", method = RequestMethod.POST)
    public String sendData(ModelMap model,@RequestParam String message){
		LOGGER.info("ApplicationController: sendData:");
		if (message.isEmpty()) {
            model.put("errorMessage",  ApplicationConstants.INVALID);
            return "home";
        }
		ApplicationUtil.setTut1Message("");
		tut1Sender.send(message);
		model.put("errorMessage", ApplicationConstants.SUCCEFULLY); 
		
        return "home";
    }
	
	@RequestMapping(value="/getData", method = RequestMethod.GET)
    public String showMessagesData(ModelMap model){
		 LOGGER.info("ApplicationController: showMessagesData:");
		model.put("queueMessage", ApplicationUtil.getTut1Message());
		LOGGER.info("ApplicationController value:"+model.values());
        return "home";
    }

	//Work queues! Message Queue request
	/*@RequestMapping(value="/workQueues", method = RequestMethod.POST)
    public String workQueue(ModelMap model,@RequestParam String message){
		LOGGER.info("ApplicationController: workQueue:");
		if (message.isEmpty()) {
            model.put("workQueuesError", ApplicationConstants.INVALID);
            return "home";
        }
		tut2Sender.send(message);
		model.put("workQueuesError", ApplicationConstants.SUCCEFULLY); 		
        return "redirect:/home";
    }*/
	
	/*@RequestMapping(value="/getWorkQueuesData", method = RequestMethod.GET)
    public String showWorkQueuesData(ModelMap model){
		 LOGGER.info("ApplicationController: showWorkQueuesData:");
		model.put("workQueueMessage", ApplicationUtil.getTut2Message());        
        return "home";
    }*/

	
	//pubSub Queues! Message Queue request
	@RequestMapping(value="/pubSubQueues", method = RequestMethod.POST)
    public String pubSubQueues(ModelMap model,@RequestParam String message){
		LOGGER.info("ApplicationController: pubSubQueues:");
		if (message.isEmpty()) {
            model.put("pubSubQueuesError", ApplicationConstants.INVALID);
            return "home";
        }
		ApplicationUtil.setPubSubQueue1Message("");
		ApplicationUtil.setPubSubQueue2Message("");
		tut3Sender.send(message);
		model.put("pubSubQueuesError", ApplicationConstants.SUCCEFULLY); 
		
        return "home";
    }
	
	@RequestMapping(value="/getPubSubQueuesData", method = RequestMethod.GET)
    public String showPubSubQueuesData(ModelMap model){
		 LOGGER.info("ApplicationController: showPubSubQueuesData:");
		model.put("pubSubQueue1Message", ApplicationUtil.getPubSubQueue1Message()); 
		model.put("pubSubQueue2Message", ApplicationUtil.getPubSubQueue2Message());        
        return "home";
    }
	
	//Routing Queues! Message Queue request
		@RequestMapping(value="/routingQueues", method = RequestMethod.POST)
	    public String routingQueues(ModelMap model,@RequestParam String message){
			LOGGER.info("ApplicationController: routingQueues:");
			if (message.isEmpty()) {
	            model.put("routingQueuesError", ApplicationConstants.INVALID);
	            return "home";
	        }
			ApplicationUtil.setRoutingQueue2Message("");
			ApplicationUtil.setRoutingQueue2Message("");
			tut4Sender.send(message);
			model.put("routingQueuesError", ApplicationConstants.SUCCEFULLY);
			ApplicationUtil.setRoutingQueue2Message("");
			ApplicationUtil.setRoutingQueue2Message("");
	        return "home";
	    }
		
		@RequestMapping(value="/getRoutingQueuesData", method = RequestMethod.GET)
	    public String showRoutingQueuesData(ModelMap model){
			 LOGGER.info("ApplicationController: showRoutingQueuesData:");
			model.put("routingQueue1Message", ApplicationUtil.getRoutingQueue1Message()); 
			model.put("routingQueue2Message", ApplicationUtil.getRoutingQueue2Message());        
	        return "home";
	    }
		
		//Topic Queues! Message Queue request
		@RequestMapping(value="/topicQueues", method = RequestMethod.POST)
	    public String topicQueues(ModelMap model,@RequestParam String message){
			LOGGER.info("ApplicationController: topicQueues:");
			if (message.isEmpty()) {
	            model.put("topicQueuesError", ApplicationConstants.INVALID);
	            return "home";
	        }
			ApplicationUtil.setTopicQueue1Message("");
			ApplicationUtil.setTopicQueue2Message("");
			tut5Sender.send(message);
			model.put("topicQueuesError", ApplicationConstants.SUCCEFULLY);
			
	        return "home";
	    }
		
		@RequestMapping(value="/getTopicQueuesData", method = RequestMethod.GET)
	    public String showTopicQueuesData(ModelMap model){
			 LOGGER.info("ApplicationController: showTopicQueuesData:");
			model.put("topicQueue1Message", ApplicationUtil.getTopicQueue1Message()); 
			model.put("topicQueue2Message", ApplicationUtil.getTopicQueue2Message());        
	        return "home";
	    }
				
				
		//Routing Queues! Message Queue request
		@RequestMapping(value="/getRPCQueuesData", method = RequestMethod.POST)
	    public String getRPCQueuesData(ModelMap model,@RequestParam int fibonacci){
			LOGGER.info("ApplicationController: getRPCQueuesData:");			
			tut6Client.send(fibonacci);
			model.put("rpcMessage",  ApplicationUtil.getRpcMessage()); 		
	        return "home";
	    }		
		
}
