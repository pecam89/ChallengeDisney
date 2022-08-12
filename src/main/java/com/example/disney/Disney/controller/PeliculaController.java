package com.example.disney.Disney.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.disney.Disney.dto.PeliculaDTO;
import com.example.disney.Disney.servicio.PeliculaServicio;


@RestController
@RequestMapping("peliculas")
public class PeliculaController {
    
    @Autowired
    private PeliculaServicio peliculaServicio;

    @PostMapping
    public ResponseEntity<PeliculaDTO> save(@RequestBody PeliculaDTO pelicula) {
        PeliculaDTO peliculaGuardado = peliculaServicio.save(pelicula);
        return ResponseEntity.status(HttpStatus.CREATED).body(peliculaGuardado);
    }

    @GetMapping
    public ResponseEntity<List<PeliculaDTO>> getAll() {
        List<PeliculaDTO> peliculas = peliculaServicio.getAllPeliculas();
        return ResponseEntity.ok().body(peliculas);
    }
}
