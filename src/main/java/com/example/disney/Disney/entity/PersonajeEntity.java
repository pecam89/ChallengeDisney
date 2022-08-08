package com.example.disney.Disney.entity;

import javax.persistence.*;

import java.util.List;
import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "personaje")
@Getter
@Setter

public class PersonajeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;
    private String nombre;
    private Integer edad;
    private Double peso;
    private String historia;

    @ManyToMany(mappedBy = "personajes", cascade = CascadeType.ALL)
    private List<PeliculaEntity> peliculas = new ArrayList<>();
    
}
