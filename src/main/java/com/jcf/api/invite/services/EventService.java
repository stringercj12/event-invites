package com.jcf.api.invite.services;

import com.jcf.api.invite.domain.dtos.EventRequestDTO;
import com.jcf.api.invite.domain.dtos.EventResponseDTO;
import com.jcf.api.invite.domain.models.Event;
import com.jcf.api.invite.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
