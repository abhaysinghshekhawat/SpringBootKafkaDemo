package com.demo.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.kafka.Util.MyObj;
import com.demo.kafka.services.KafkaSender;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
	
	@Autowired
	private KafkaSender kafkaSender;
	
	@Value("${spring.kafka.topic.name}")
	private String topic;

	/*
	 * @Autowired KafkaController(KafkaSender kafkaSender){ this.kafkaSender =
	 * kafkaSender; }
	 */
	
	@GetMapping("/producer")
	public ResponseEntity<?> startProducer(@RequestParam String name, @RequestParam int age){
		
		MyObj obj = new MyObj();
		obj.setAge(age);
		obj.setName(name);
		kafkaSender.sendMessage(topic,obj);
		return ResponseEntity.ok().body("message sent successfully");
	}
	
}
