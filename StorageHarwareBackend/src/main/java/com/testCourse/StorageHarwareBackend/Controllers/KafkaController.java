package com.testCourse.StorageHarwareBackend.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/kafka")
public class KafkaController {
 
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Object> getIndexPage() {
		
		return ResponseEntity.ok(null);
	}
	
   @KafkaListener(topics =  "#{'${spring.kafka.topic.test_java}'}", containerFactory = "kafkaListenerContainerFactory")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group foo: " + message);
    }

}
