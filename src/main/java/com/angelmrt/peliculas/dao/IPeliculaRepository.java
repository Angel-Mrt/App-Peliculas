package com.angelmrt.peliculas.dao;

import com.angelmrt.peliculas.entity.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IPeliculaRepository extends JpaRepository<Pelicula,Long> {


}
