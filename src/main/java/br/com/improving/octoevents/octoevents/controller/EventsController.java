package br.com.improving.octoevents.octoevents.controller;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/call")
public class EventsController {
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<String> insertWebhookdData(@RequestBody Event obj) {
		
		JSONObject jsonObject = new JSONObject(obj);
		System.out.println(jsonObject);
		return ResponseEntity.status(HttpStatus.OK).body("Tudo certo aqui mano");
	}

}
