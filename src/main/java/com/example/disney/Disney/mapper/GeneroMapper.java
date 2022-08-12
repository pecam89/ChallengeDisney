package com.example.disney.Disney.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.example.disney.Disney.dto.GeneroDTO;
import com.example.disney.Disney.entity.GeneroEntity;

@Component
public class GeneroMapper {
    
    public GeneroEntity generoDTOtoEntity(GeneroDTO dto) {
        GeneroEntity generoEntity = new GeneroEntity();
        generoEntity.setImagen(dto.getImagen());
        generoEntity.setNombre(dto.getNombre());
        return generoEntity;
    }

    public GeneroDTO generoEntityToDTO(GeneroEntity entity) {
        GeneroDTO generoDTO = new GeneroDTO();
        generoDTO.setId(entity.getId());
        generoDTO.setImagen(entity.getImagen());
        generoDTO.setNombre(entity.getNombre());
        return generoDTO;
    }

    public List<GeneroDTO> generoEntityToDTOList(List<GeneroEntity> entities) {
        List<GeneroDTO> dtos = new ArrayList<>();
        for (GeneroEntity entity : entities) {
            dtos.add(this.generoEntityToDTO(entity));
        }
        return dtos;
    }
}
