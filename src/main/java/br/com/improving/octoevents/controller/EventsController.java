package br.com.improving.octoevents.controller;

import br.com.improving.octoevents.model.Event;
import br.com.improving.octoevents.service.EventService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/events")
public class EventsController {

	@Autowired
	private EventService eventservice;

	@PostMapping("/createEvent")
	public ResponseEntity<String> insertEventsOnDatabase(@RequestBody Event event) {


	Event newEvent = new Event();
	newEvent.setZen(event.getZen());
	newEvent.setHook_id(event.getHook_id());

	eventservice.insert(newEvent);

		return ResponseEntity.status(HttpStatus.OK).body("vamos lá man");
	}

	@GetMapping("/issues/{id}/events")
	public ResponseEntity<String> getEventsByIssue(@RequestBody Event obj) {

		JSONObject jsonObject = new JSONObject(obj);
		System.out.println(jsonObject);



		return ResponseEntity.status(HttpStatus.OK).body("vamos lá man");
	}

	@PostMapping("/get")
	public ResponseEntity<String> getTest(@RequestBody Event obj) {
		System.out.println(obj.getHook_id()+obj.getZen());

		return ResponseEntity.status(HttpStatus.OK).body("vamos lá man");
	}

}
