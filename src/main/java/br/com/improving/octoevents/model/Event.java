package br.com.improving.octoevents.model;

import javax.persistence.*;

@Entity
@Table(name="event",schema="public")
public class Event {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	Long id;

	Long hook_id;
	String zen;
	
	//Hook hook;
	
	public Event() { }
	
	public Event(Long hook_id, String zen) {

		this.hook_id = hook_id;
		this.zen = zen;
	}
		
	public String getZen() {
		return zen;
	}
	
	public void setZen(String zen) {
		this.zen = zen;
	}
	
	public void setHook_id(Long hook_id) {
		this.hook_id = hook_id;
	}
	
	public Long getHook_id() {
		return hook_id;
	}
	
	
}
