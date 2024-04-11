package com.angelmrt.peliculas.controllers;

import com.angelmrt.peliculas.dao.IGeneroRepository;
import com.angelmrt.peliculas.entity.Genero;
import com.angelmrt.peliculas.services.IGeneroService;
import org.springframework.web.bind.annotation.*;

@RestController
public class GeneroController {

    private IGeneroService service;

    public  GeneroController(IGeneroService service){
        this.service=service;
    }
    @PostMapping("genero")
    public Long guardar (@RequestParam String nombre){
        Genero genero= new Genero();
        genero.setNombre(nombre);
        service.save(genero);
        return genero.getId();
    }

    @GetMapping("genero/{id}")
    public String buscarPorId(@PathVariable(name = "id")Long id){
        return service.findById(id).getNombre();
    }
}
