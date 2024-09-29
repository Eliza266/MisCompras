package com.app_miscompras.app.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id()
    @Column(length = 20)
    private String id;

    @Column(length = 40)
    private String nombre;

    @Column(length = 100)
    private String apellidos;

    @Column(length = 10)
    private float celular;

    @Column(length = 80)
    private String direccion;

    @Column(length = 70)
    private String correo_electronico;

    public Cliente() {
    }

    public Cliente(String id, String nombre, String apellidos, float celular, String direccion, String correo_electronico) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.celular = celular;
        this.direccion = direccion;
        this.correo_electronico = correo_electronico;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public float getCelular() {
        return this.celular;
    }

    public void setCelular(float celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo_electronico() {
        return this.correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    
}
