package com.example.disney.Disney.dto;

import java.time.LocalDate;
import java.util.*;

import com.example.disney.Disney.entity.PersonajeEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PeliculaDTO {
    
    private Long id;

    private String imagen;
    private String titulo;
    private LocalDate fechaCreacion;
    private Integer calificacion;
    private Long generoId;
    private Set<PersonajeEntity> personajes = new HashSet<>(); 
}
