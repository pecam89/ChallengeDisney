package com.example.disney.Disney.servicio;

import java.util.List;
import com.example.disney.Disney.dto.PeliculaDTO;

public interface PeliculaServicio {
    
    PeliculaDTO save(PeliculaDTO dto);

    List<PeliculaDTO> getAllPeliculas();
}
