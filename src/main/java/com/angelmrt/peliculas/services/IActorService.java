package com.angelmrt.peliculas.services;

import com.angelmrt.peliculas.entity.Actor;

import java.util.List;

public interface IActorService {
    public List<Actor> findAll();
    public  List<Actor> findAllById(List<Long>ids);
}
