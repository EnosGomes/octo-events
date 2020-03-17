package br.com.improving.octoevents.model;

public class Event {
	Integer hook_id;
	String zen;
	
	Hook hook; 
	
	public Event() { }
	
	public Event(String zen, Integer hook_id) {
		zen = this.zen;
		hook_id = this.hook_id;
	}
	
	
	
	public String getZen() {
		return zen;
	}
	
	public void setZen(String zen) {
		this.zen = zen;
	}
	
	public void setHook_id(Integer hook_id) {
		this.hook_id = hook_id;
	}
	
	public Integer getHook_id() {
		return hook_id;
	}
	
	
}
