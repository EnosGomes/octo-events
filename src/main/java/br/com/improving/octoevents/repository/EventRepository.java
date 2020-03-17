package br.com.improving.octoevents.repository;

import br.com.improving.octoevents.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Integer, Event> {
}
