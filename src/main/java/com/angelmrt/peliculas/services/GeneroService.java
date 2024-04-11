package com.angelmrt.peliculas.services;

import com.angelmrt.peliculas.dao.IGeneroRepository;
import com.angelmrt.peliculas.entity.Genero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroService implements IGeneroService{

    @Autowired
    private IGeneroRepository iGeneroRepository;

    @Override
    public void save(Genero genero) {
        iGeneroRepository.save(genero);
    }

    @Override
    public Genero findById(Long id) {
        return iGeneroRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {

        iGeneroRepository.deleteById(id);
    }

    @Override
    public List<Genero> findAll() {
        return (List<Genero>) iGeneroRepository.findAll();
    }
}
