package com.example.disney.Disney.mapper;

import org.springframework.stereotype.Component;
import com.example.disney.Disney.dto.PersonajeDTO;
import com.example.disney.Disney.entity.PersonajeEntity;

import java.util.ArrayList;
import java.util.List;

    @Component
    public class PersonajeMapper {
        
        public PersonajeEntity personajeDTOtoEntity(PersonajeDTO dto){
            PersonajeEntity entity = new PersonajeEntity();
            entity.setImagen(dto.getImagen());
            entity.setNombre(dto.getNombre());
            entity.setEdad(dto.getEdad());
            entity.setPeso(dto.getPeso());
            entity.setHistoria(dto.getHistoria());
            //entity.setPeliculas(dto.getPeliculas());
            return entity;
        }

    public PersonajeDTO personajeEntityToDTO(PersonajeEntity entity) {
        PersonajeDTO dto = new PersonajeDTO();
            dto.setId(entity.getId());
            dto.setImagen(entity.getImagen());
            dto.setNombre(entity.getNombre());
            dto.setEdad(entity.getEdad());
            dto.setPeso(entity.getPeso());
            dto.setHistoria(entity.getHistoria());
            //dto.setPeliculas(entity.getPeliculas());
            return dto;
    }

    public List<PersonajeDTO> personajeListEntityToListDTO(List<PersonajeEntity> entities) {
        List<PersonajeDTO> dtos = new ArrayList<>();
        for (PersonajeEntity entity : entities) { 
            dtos.add(personajeEntityToDTO(entity)); 
        }
        return dtos;
    }
}
