package com.example.disney.Disney.servicio.Implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.disney.Disney.dto.PersonajeDTO;
import com.example.disney.Disney.entity.PersonajeEntity;
import com.example.disney.Disney.mapper.PersonajeMapper;
import com.example.disney.Disney.repositorio.PersonajeRepositorio;
import com.example.disney.Disney.servicio.PersonajeServicio;

@Service
public class PersonajeServicioImpl implements PersonajeServicio{
    
    @Autowired
    private PersonajeRepositorio personajeRepositorio;

    @Autowired
    private PersonajeMapper personajeMapper;

    public PersonajeDTO save(PersonajeDTO dto) {
        PersonajeEntity entity = personajeMapper.personajeDTOtoEntity(dto);
        PersonajeEntity entitySaved = personajeRepositorio.save(entity);
        PersonajeDTO result = personajeMapper.personajeEntityToDTO(entitySaved);
        return result;
    }

    public List<PersonajeDTO> getAllPersonajes() {
        List<PersonajeEntity> entities = personajeRepositorio.findAll();
        List<PersonajeDTO> result = personajeMapper.personajeListEntityToListDTO(entities);
        return result;  
        
    }
}

