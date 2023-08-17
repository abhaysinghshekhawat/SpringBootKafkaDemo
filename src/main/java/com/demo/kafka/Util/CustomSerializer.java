package com.demo.kafka.Util;

import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Serializer;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CustomSerializer implements Serializer<MyObj> {

	private  ObjectMapper objectMapper = new ObjectMapper();
	@Override
	public byte[] serialize(String topic, MyObj data) {
		try {
            if (data == null){
                System.out.println("Null received at serializing");
                return null;
            }
            System.out.println("Serializing...");
            return objectMapper.writeValueAsBytes(data);
        } catch (Exception e) {
            throw new SerializationException("Error when serializing MessageDto to byte[]");
		// TODO Auto-generated method stub
	}

}
}

