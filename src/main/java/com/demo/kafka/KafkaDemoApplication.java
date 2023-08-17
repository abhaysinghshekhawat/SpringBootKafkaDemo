package com.demo.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties.Env;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.stereotype.Component;




@SpringBootApplication
@Configuration
@PropertySource("classpath:application.properties")
public class KafkaDemoApplication {

	
	
	public static void main(String[] args) {
		//System.out.println(env.getProperty("testing"));
		SpringApplication.run(KafkaDemoApplication.class, args);
		
		
	}
	
	
	
	
	

}
