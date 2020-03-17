package br.com.improving.octoevents.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.improving.octoevents.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event,Integer>{
	
	

}
