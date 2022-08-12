package com.example.disney.Disney.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.disney.Disney.dto.PersonajeDTO;
import com.example.disney.Disney.servicio.PersonajeServicio;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("personaje")
public class PersonajeController {
    
    @Autowired
    private PersonajeServicio personajeServicio;

    @PostMapping
    public ResponseEntity<PersonajeDTO> save(@RequestBody PersonajeDTO personaje) {
        PersonajeDTO personajeGuardado = personajeServicio.save(personaje);
        return ResponseEntity.status(HttpStatus.CREATED).body(personajeGuardado);
    }
    
    @GetMapping
    public ResponseEntity<List<PersonajeDTO>> getAll() {
        List<PersonajeDTO> personajes = personajeServicio.getAllPersonajes();
        return ResponseEntity.ok().body(personajes);
    }
}
