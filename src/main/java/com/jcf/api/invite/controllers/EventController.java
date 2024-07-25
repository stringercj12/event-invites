package com.jcf.api.invite.controllers;


import com.jcf.api.invite.domain.dtos.EventRequestDTO;
import com.jcf.api.invite.domain.dtos.EventResponseDTO;
import com.jcf.api.invite.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping
    public ResponseEntity<EventResponseDTO> create(@RequestBody EventRequestDTO eventRequestDTO) {
        EventResponseDTO event = this.eventService.createEvent(eventRequestDTO);
        return ResponseEntity.ok(event);
    }

    @GetMapping
    public ResponseEntity<List<EventResponseDTO>> getAll() {
        return this.eventService.getAll();
    }
}
