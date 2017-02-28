package com.example.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleKafkaController {

	@Autowired KafkaProducer kafkaProducer;
	
	@RequestMapping(value="/produceKafkaMessage")
	public String sendKafkaMessage(@RequestParam("name") String name){
		kafkaProducer.sendMessage("helloworld.kafka.Topic", "Hello "+name);
		return "Successfully Produced Message to Kafka Topic";
		
	}
}
