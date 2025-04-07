package com.example.peliculasbbdd.service;

import com.example.peliculasbbdd.model.Peliculas;
import java.util.List;
import java.util.Optional;

public interface PeliculasService {
    List<Peliculas> getAllPeliculas();
    Optional<Peliculas> getPeliculasById(Long id);
    
}
