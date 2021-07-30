package com.ivoronline.springboot_activemq_provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired JmsTemplate jmsTemplate;

  @RequestMapping("SendMessage")
  String sendMessage(@RequestParam String message){
		jmsTemplate.convertAndSend("Queue1",  message);
    return "Sent Message to Queue1: "  +  message;
  }

}

