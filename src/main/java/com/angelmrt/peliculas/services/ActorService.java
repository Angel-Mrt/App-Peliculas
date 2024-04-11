package com.angelmrt.peliculas.services;

import com.angelmrt.peliculas.dao.IActorRepository;
import com.angelmrt.peliculas.entity.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService  implements IActorService{

    @Autowired
    private IActorRepository repo;
    @Override
    public List<Actor> findAll() {

        return (List<Actor>) repo.findAll();
    }

    @Override
    public List<Actor> findAllById(List<Long> ids) {
        return (List<Actor>) repo.findAllById(ids);
    }


}
