package com.example.peliculasbbdd.repository;

import com.example.peliculasbbdd.model.Peliculas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PeliculasRepository extends JpaRepository<Peliculas, Long> {
    
}
