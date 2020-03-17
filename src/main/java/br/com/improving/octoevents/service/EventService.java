package br.com.improving.octoevents.service;

import br.com.improving.octoevents.model.Event;
import br.com.improving.octoevents.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    @Autowired
    private EventRepository repo;


    public void insert(Event event) {
       repo.save(event);
    }
}
