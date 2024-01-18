package com.example.Iglesias.model;

import jakarta.persistence.*;

@Entity
@Table(name="Cliente")
public class ClientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 50)
    private String nombre;

    @Column(length = 50)
    private String paterno;

    @Column(length = 50)
    private String materno;

    @Column(length = 100)
    private String direccion;

    @Column(length = 20)
    private String email;

    @Column(length = 60)
    private String users;

    @Column(length = 50)
    private String password;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


}
