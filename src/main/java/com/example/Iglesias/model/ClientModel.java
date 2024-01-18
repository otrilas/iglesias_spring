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

    public String getNombre() {
        return nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getUsers() {
        return users;
    }

    public String getPassword() {
        return password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
