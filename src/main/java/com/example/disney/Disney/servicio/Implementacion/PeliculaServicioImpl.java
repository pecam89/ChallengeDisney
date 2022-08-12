package com.example.disney.Disney.servicio.Implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.example.disney.Disney.dto.PeliculaDTO;
import com.example.disney.Disney.entity.PeliculaEntity;
import com.example.disney.Disney.mapper.PeliculaMapper;
import com.example.disney.Disney.repositorio.PeliculaRepositorio;
import com.example.disney.Disney.servicio.PeliculaServicio;

@Service
public class PeliculaServicioImpl implements PeliculaServicio {
    

    @Autowired
    private PeliculaMapper peliculaMapper;

    @Autowired
    private PeliculaRepositorio peliculaRepositorio;

    public PeliculaDTO save(PeliculaDTO dto) {
        PeliculaEntity entity = peliculaMapper.peliculaDTOtoEntity(dto);
        PeliculaEntity entitySaved = peliculaRepositorio.save(entity);
        PeliculaDTO result = peliculaMapper.peliculaEntityToDTO(entitySaved);
        return result;   
    }

    public List<PeliculaDTO> getAllPeliculas() {
        List<PeliculaEntity> entities = peliculaRepositorio.findAll();
        List<PeliculaDTO> result = peliculaMapper.peliculaEntityListToDTOList(entities);
        return result;
    }
}
