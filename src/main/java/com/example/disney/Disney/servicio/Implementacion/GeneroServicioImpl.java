package com.example.disney.Disney.servicio.Implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.disney.Disney.dto.GeneroDTO;
import com.example.disney.Disney.entity.GeneroEntity;
import com.example.disney.Disney.mapper.GeneroMapper;
import com.example.disney.Disney.repositorio.GeneroRepositorio;
import com.example.disney.Disney.servicio.GeneroServicio;

@Service
public class GeneroServicioImpl implements GeneroServicio {

    @Autowired
    private GeneroMapper generoMapper;

    @Autowired
    private GeneroRepositorio generoRepositorio;

    public GeneroDTO save(GeneroDTO dto) {
        
        GeneroEntity entity = generoMapper.generoDTOtoEntity(dto);
        GeneroEntity entitySaved = generoRepositorio.save(entity);
        GeneroDTO result = generoMapper.generoEntityToDTO(entitySaved);
        return result;   
    }

    public List<GeneroDTO> getAllGeneros() {
        List<GeneroEntity> entities = this.generoRepositorio.findAll();
        List<GeneroDTO> result = this.generoMapper.generoEntityToDTOList(entities);
        return result;
    }
}
