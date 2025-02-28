package com.angelmrt.peliculas.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="actores")
public class Actor implements Serializable {

    private static final long serialVersionUID = -3371139423810856567L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @Column(name = "url_imagen")
    private String urlImagen;

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

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
}
