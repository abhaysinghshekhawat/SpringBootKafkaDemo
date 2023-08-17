package com.demo.kafka.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.demo.kafka.Util.MyObj;
import com.google.gson.Gson;


@Service
public class KafkaListenerService {

	
	Logger LOG = LoggerFactory.getLogger(KafkaListenerService.class);
	  
	  @KafkaListener(topics = "${spring.kafka.topic.name}",groupId="${spring.kafka.consumer.group-id}")
	  public void listener(MyObj data) {
		  Gson gson = new Gson();
		  String jsonString = gson.toJson(data);
	    LOG.info(jsonString);
	  }

}
