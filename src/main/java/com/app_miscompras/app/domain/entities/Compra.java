package com.app_miscompras.app.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name = "compras")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne()
    private Cliente cliente;

    @Column()
    private Date fecha;

    @Column(length = 1)
    private char medio_pago;

    @Column(length = 300)
    private String comentario;

    @Column(length = 1)
    private char estado;

    public Compra() {
    }

    public Compra(long id, Cliente cliente, Date fecha, char medio_pago, String comentario, char estado) {
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
        this.medio_pago = medio_pago;
        this.comentario = comentario;
        this.estado = estado;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public char getMedio_pago() {
        return this.medio_pago;
    }

    public void setMedio_pago(char medio_pago) {
        this.medio_pago = medio_pago;
    }

    public String getComentario() {
        return this.comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public char getEstado() {
        return this.estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }


    
}
