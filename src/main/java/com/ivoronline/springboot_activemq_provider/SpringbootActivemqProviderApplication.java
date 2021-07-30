package com.ivoronline.springboot_activemq_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class SpringbootActivemqProviderApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(SpringbootActivemqProviderApplication.class, args);
    //JmsTemplate        jms = ctx.getBean(JmsTemplate.class);
		//jms.convertAndSend("javainuse", "test message");
  }

}
