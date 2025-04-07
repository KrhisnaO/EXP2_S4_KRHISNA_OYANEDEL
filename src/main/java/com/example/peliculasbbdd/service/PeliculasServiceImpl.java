package com.example.peliculasbbdd.service;

import com.example.peliculasbbdd.repository.PeliculasRepository;
import com.example.peliculasbbdd.model.Peliculas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class PeliculasServiceImpl implements PeliculasService {

    @Autowired
    private PeliculasRepository peliculasRepository;

    @Override
    public List<Peliculas> getAllPeliculas(){
        return peliculasRepository.findAll();
    }

    @Override
    public Optional<Peliculas> getPeliculasById(Long id){
        return peliculasRepository.findById(id);
    }

    
}
