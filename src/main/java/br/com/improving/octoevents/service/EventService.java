package br.com.improving.octoevents.service;

import br.com.improving.octoevents.dto.EventDTO;
import br.com.improving.octoevents.model.Event;
import br.com.improving.octoevents.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

public class EventService {
    @Autowired
    private EventRepository repo;

    @Transactional
    public Event insert(Event obj) {
        //obj = repo.save(obj);
        return obj;
    }

    public Event fromDTO(EventDTO objDto) {
        return new Event(objDto.getZen(),objDto.getHook_id());
    }
}
