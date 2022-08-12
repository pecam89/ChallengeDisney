package com.example.disney.Disney.servicio;

import java.util.List;
import com.example.disney.Disney.dto.GeneroDTO;

public interface GeneroServicio {
    
    GeneroDTO save(GeneroDTO dto);

    List<GeneroDTO> getAllGeneros();
}
