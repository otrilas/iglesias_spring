package com.example.Iglesias.model;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name="Reserva")
public class ReservaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private Date fecha_reserva;

    @Column
    private Time hora_reserva;

    @Column
    private Integer id_iglecia;

    @Column
    private  Integer id_cliente;

    @Column
    private Integer id_acontecimiento_social;

    public Long getId() {
        return id;
    }

    public Date getFecha_reserva() {
        return fecha_reserva;
    }

    public Time getHora_reserva() {
        return hora_reserva;
    }

    public Integer getId_iglecia() {
        return id_iglecia;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public Integer getId_acontecimiento_social() {
        return id_acontecimiento_social;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFecha_reserva(Date fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public void setHora_reserva(Time hora_reserva) {
        this.hora_reserva = hora_reserva;
    }

    public void setId_iglecia(Integer id_iglecia) {
        this.id_iglecia = id_iglecia;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setId_acontecimiento_social(Integer id_acontecimiento_social) {
        this.id_acontecimiento_social = id_acontecimiento_social;
    }
}
