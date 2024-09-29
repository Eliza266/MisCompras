package com.app_miscompras.app.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "compras_productos")
public class CompraProducto {

    @EmbeddedId
    private CompraProductoPK id;

    @ManyToOne()
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne()
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;

    @Column()
    private int Cantidad;

    @Column(length = 16)
    private float total;

    @Column(length = 45)
    private byte estado;

    public CompraProducto() {
    }

    public CompraProducto(Compra compra, Producto producto, int Cantidad, float total, byte estado) {
        this.compra = compra;
        this.producto = producto;
        this.Cantidad = Cantidad;
        this.total = total;
        this.estado = estado;
    }

    public Compra getCompra() {
        return this.compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return this.Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public float getTotal() {
        return this.total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public byte getEstado() {
        return this.estado;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }

}
