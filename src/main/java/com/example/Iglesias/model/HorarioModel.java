package com.example.Iglesias.model;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "Horario")
public class HorarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private Date fecha;

    @Column
    private Time hora;

    @Column
    private Integer id_iglecia;

    public Long getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHora() {
        return hora;
    }

    public Integer getId_iglecia() {
        return id_iglecia;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public void setId_iglecia(Integer id_iglecia) {
        this.id_iglecia = id_iglecia;
    }
}
