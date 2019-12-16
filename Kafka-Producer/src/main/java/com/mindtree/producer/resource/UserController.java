package com.mindtree.producer.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.producer.model.User;

@RestController
@RequestMapping("kafka")
public class UserController {

	/*@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;*/
	
	@Autowired
	private KafkaTemplate<String, User> kafkaUserTemplate;
	
	@Autowired
	private KafkaTemplate<String,String> kafkatemplate;

	private static final String TOPIC = "win";

	@RequestMapping(value = "/user-information", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String post(@RequestBody User user) {
		kafkaUserTemplate.send(TOPIC, user);
		return "Published successfully";
	}
	
	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public String post(@RequestParam("message") String message) {
		kafkatemplate.send(TOPIC, message);
		return "Published successfully";
	}
}
