package com.example.disney.Disney.servicio;

import java.util.List;
import com.example.disney.Disney.dto.PersonajeDTO;

public interface PersonajeServicio {
    
    PersonajeDTO save(PersonajeDTO dto);

    List<PersonajeDTO> getAllPersonajes();

}
