package com.app_miscompras.app.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 45)
    private String descripcion;

    @Column(length = 45)
    private byte estado;

    public Categoria() {
    }

    public Categoria(long id, String descripcion, byte estado) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public byte getEstado() {
        return this.estado;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }



}
