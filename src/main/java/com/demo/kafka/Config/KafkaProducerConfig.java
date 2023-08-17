package com.demo.kafka.Config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.demo.kafka.Util.CustomSerializer;
import com.demo.kafka.Util.MyObj;

//@Configuration
public class KafkaProducerConfig {

	/*@Value("${spring.kafka.consumer.bootstrap-servers}")
	private String bootstrapservers;
	
	@Bean
	public Map<String,Object> producerConfigs(){
		Map<String,Object> props = new HashMap<>();
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapservers);
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
			      StringSerializer.class);
	    //props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
			//      StringSerializer.class); // for serializing the simple strings
		//props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,CustomSerializer.class);
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class); // this is for serializing the objects
	   return props;
	}
	
	@Bean
	public ProducerFactory<String, Object> producerFactory() {
	    return new DefaultKafkaProducerFactory<>(producerConfigs());
	  }
	
	 @Bean
	 public KafkaTemplate<String, Object> kafkaTemplate() {
	    return new KafkaTemplate<>(producerFactory());
	  } */
	
}
