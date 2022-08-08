package com.example.disney.Disney.entity;

import javax.persistence.*;
import java.util.Set;
import java.util.HashSet;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pelicula")
@Getter
@Setter

public class PeliculaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;
    private String titulo;

    @Column(name = "fecha_creacion")
    @DateTimeFormat(pattern = "yyyy/MM/aa")
    private LocalDate fechaCreacion;

    private Integer calificacion;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "genero_id", insertable = false, updatable = false)
    private GeneroEntity genero;

    @Column(name = "genero_id", nullable = false)
    private Long generoId;

    @ManyToMany(
                cascade = {
                            CascadeType.PERSIST,
                            CascadeType.MERGE
                })
    @JoinTable(
                name = "personaje_pelicula",
                joinColumns = @JoinColumn(name = "pelicula_id"),
                inverseJoinColumns = @JoinColumn(name = "personaje_id")
                )
    private Set<PersonajeEntity> personajes = new HashSet<>();

}
