package com.example.peliculasbbdd.controller;

import com.example.peliculasbbdd.model.Peliculas;
import com.example.peliculasbbdd.service.PeliculasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/peliculas")
public class PeliculasController {

    @Autowired
    private PeliculasService peliculasService;

    @GetMapping
    public List<Peliculas> getAllPeliculas() {
        return peliculasService.getAllPeliculas();
    }
    

    @GetMapping("/{id}")
    public Optional<Peliculas> getPeliculaSById(@PathVariable Long id) {
        return peliculasService.getPeliculasById(id);
    }
    
}
