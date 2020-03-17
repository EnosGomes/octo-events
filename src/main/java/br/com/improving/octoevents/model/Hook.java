package br.com.improving.octoevents.model;

import java.util.ArrayList;
import java.util.List;

public class Hook {

	String type;
	Integer id;
	String name;
	List<String> events = new ArrayList<String>();
	
	public Hook() {
		
	}
	
	public String getType() {
		return type;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public List<String> getEvents() {
		return events;
	}
	
}
