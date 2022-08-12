package com.example.disney.Disney.dto;

import java.util.*;

import com.example.disney.Disney.entity.PeliculaEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonajeDTO {
    
    private Long id;

    private String imagen;
    private String nombre;
    private Long edad;
    private Double peso;
    private String historia;
    private List<PeliculaEntity>peliculas = new ArrayList<>();
}
