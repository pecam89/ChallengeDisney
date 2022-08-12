package com.example.disney.Disney.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.disney.Disney.entity.PeliculaEntity;

@Repository
public interface PeliculaRepositorio extends JpaRepository<PeliculaEntity, Long>{
    
}
