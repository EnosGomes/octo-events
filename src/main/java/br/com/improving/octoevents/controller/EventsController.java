package br.com.improving.octoevents.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.improving.octoevents.model.Event;
import br.com.improving.octoevents.service.EventService;

@RestController
@RequestMapping(value = "/events")
public class EventsController {

	@Autowired
	private EventService eventservice;

	@PostMapping(value = "/createEvent")
	public ResponseEntity<String> insertEventsOnDatabase(@RequestBody Event obj) {

		JSONObject jsonObject = new JSONObject(obj);
		System.out.println(jsonObject);
		
		eventservice.insert(obj);
		
		return ResponseEntity.status(HttpStatus.OK).body("vamos lá man");
	}

	@GetMapping(value = "/issues/{id}/events")
	public ResponseEntity<String> getEventsByIssue(@RequestBody Event obj) {

		JSONObject jsonObject = new JSONObject(obj);
		System.out.println(jsonObject);

		

		return ResponseEntity.status(HttpStatus.OK).body("vamos lá man");
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.POST)
	public ResponseEntity<String> getTest(@RequestBody Event obj) {
		System.out.println();

		return ResponseEntity.status(HttpStatus.OK).body("vamos lá man");
	}

}
