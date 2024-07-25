package com.jcf.api.invite.services;

import com.jcf.api.invite.domain.dtos.EventRequestDTO;
import com.jcf.api.invite.domain.dtos.EventResponseDTO;
import com.jcf.api.invite.domain.models.Event;
import com.jcf.api.invite.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {


    @Autowired
    private EventRepository eventRepository;


    public EventResponseDTO createEvent(EventRequestDTO eventRequestDTO) {

        Event newEvent = new Event();

        newEvent.setNome(eventRequestDTO.nome());
        newEvent.setDescricao(eventRequestDTO.descricao());
        this.eventRepository.save(newEvent);

        return new EventResponseDTO(
                newEvent.getId(),
                newEvent.getNome(),
                newEvent.getDescricao(),
                newEvent.getLocal(),
                newEvent.getData(),
                newEvent.getCapa(),
                newEvent.getTelefone(),
                newEvent.getEmail()
        );
    }

    public List<EventResponseDTO> getAll(){
        List<Event> events = this.eventRepository.findAll();

        return events.stream().map((event) ->
            new EventResponseDTO(
                    event.getId(),
                    event.getNome(),
                    event.getDescricao(),
                    event.getLocal(),
                    event.getData(),
                    event.getCapa(),
                    event.getTelefone(),
                    event.getEmail()
            )
        ).toList();
    }
}
