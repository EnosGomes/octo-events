package br.com.improving.octoevents.dto;

import java.io.Serializable;

import br.com.improving.octoevents.model.Event;

public class EventDTO implements Serializable {

	String zen;
	Integer hook_id;
	// Hook hook;

	public EventDTO() { }

	public String getZen() {
		return zen;
	}

	public Integer getHook_id() {
		return hook_id;
	}

}
