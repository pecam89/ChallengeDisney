package com.example.disney.Disney.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.disney.Disney.entity.PersonajeEntity;

@Repository
public interface PersonajeRepositorio extends JpaRepository<PersonajeEntity, Long>{
    
}
