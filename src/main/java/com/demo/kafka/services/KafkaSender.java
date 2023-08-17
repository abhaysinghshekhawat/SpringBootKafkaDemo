package com.demo.kafka.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.demo.kafka.Util.MyObj;


@Service
public class KafkaSender {

	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;

	  public void sendMessage(String topicName, String message) {
	    kafkaTemplate.send(topicName,message);
	  }
	  
	  public void sendMessage(String topicName, Object msg) {
		  
		  kafkaTemplate.send(topicName,msg);
	  }
}
