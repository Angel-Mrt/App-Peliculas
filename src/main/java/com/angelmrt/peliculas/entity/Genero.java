package com.angelmrt.peliculas.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "generos")
public class Genero implements Serializable {


    private static final long serialVersionUID = -7912618105701795033L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
