package com.example.Iglesias.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Acnotecimineto_social")
public class AcontecimientoSocialModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 50)
    private String nombre;

    @Column(length = 100)
    private String desripcion;

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDesripcion() {
        return desripcion;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDesripcion(String desripcion) {
        this.desripcion = desripcion;
    }
}
