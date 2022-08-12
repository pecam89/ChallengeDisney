package com.example.disney.Disney.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.disney.Disney.dto.PeliculaDTO;
import com.example.disney.Disney.entity.PeliculaEntity;

@Component
public class PeliculaMapper {
    
    public PeliculaEntity peliculaDTOtoEntity(PeliculaDTO dto) {
        PeliculaEntity entity = new PeliculaEntity();
        entity.setImagen(dto.getImagen());
        entity.setTitulo(dto.getTitulo());
        entity.setFechaCreacion(dto.getFechaCreacion());
        entity.setCalificacion(dto.getCalificacion());
        entity.setGeneroId(dto.getGeneroId());
       // entity.setPersonajes(dto.getPersonajes());
        return entity;
    }

    public PeliculaDTO peliculaEntityToDTO(PeliculaEntity entity) {
        PeliculaDTO dto = new PeliculaDTO();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setTitulo(entity.getTitulo());
        dto.setFechaCreacion(entity.getFechaCreacion());
        dto.setCalificacion(entity.getCalificacion());
        dto.setGeneroId(entity.getGeneroId());
        dto.setPersonajes(entity.getPersonajes());
        return dto;
    }

    public List<PeliculaDTO> peliculaEntityListToDTOList(List<PeliculaEntity> entities) {
        List<PeliculaDTO> dtos = new ArrayList<>();
        for (PeliculaEntity entity : entities) {
            dtos.add(peliculaEntityToDTO(entity));
        }
        return dtos;
    }
}
