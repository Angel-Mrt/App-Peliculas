package com.angelmrt.peliculas.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "peliculas")
public class Pelicula implements Serializable {


    private static final long serialVersionUID = 2280338994465271083L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "El nombre no debe de ser vacio")
    private String name;

    @NotNull(message = "El campo Fecha Estreno no debe de estar vacio")
    @Column(name = "fecha_estreno")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyy-MM-dd")
    private Date fechaEstreno;
    @NotNull()
    @ManyToOne
    private Genero genero;

    @ManyToMany
    private List<Actor> protagonistas;

    private  String imagen;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(Date fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }


    public List<Actor> getProtagonistas() {
        return protagonistas;
    }

    public void setProtagonistas(List<Actor> protagonistas) {
        this.protagonistas = protagonistas;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
