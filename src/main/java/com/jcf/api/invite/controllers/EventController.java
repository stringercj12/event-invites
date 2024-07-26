package com.jcf.api.invite.controllers;


import com.jcf.api.invite.domain.dtos.EventRequestDTO;
import com.jcf.api.invite.domain.dtos.EventResponseDTO;
import com.jcf.api.invite.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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
        List<EventResponseDTO> events = this.eventService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(events);
    }

    @GetMapping("{id}")
    public ResponseEntity<EventResponseDTO> getEventById(@PathVariable("id") UUID eventId) {
        EventResponseDTO event = this.eventService.getEventById(eventId);
        return ResponseEntity.status(HttpStatus.OK).body(event);
    }

}
