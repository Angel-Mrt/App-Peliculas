package com.angelmrt.peliculas.dao;

import com.angelmrt.peliculas.entity.Actor;
import org.springframework.data.repository.CrudRepository;

public interface IActorRepository extends CrudRepository<Actor, Long> {
}
