package com.farmaciascomunales.compras.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idProducto;   // ID de producto comprado
    private String proveedor;
    private String lote;
    private int cantidad;
    private int precioUnitario;

    private boolean notaCredito; // true si es una devolución o descuento
    private LocalDate fechaCompra;

    // Getters y setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Long getIdProducto() { return idProducto; }

    public void setIdProducto(Long idProducto) { this.idProducto = idProducto; }

    public String getProveedor() { return proveedor; }

    public void setProveedor(String proveedor) { this.proveedor = proveedor; }

    public String getLote() { return lote; }

    public void setLote(String lote) { this.lote = lote; }

    public int getCantidad() { return cantidad; }

    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public int getPrecioUnitario() { return precioUnitario; }

    public void setPrecioUnitario(int precioUnitario) { this.precioUnitario = precioUnitario; }

    public boolean isNotaCredito() { return notaCredito; }

    public void setNotaCredito(boolean notaCredito) { this.notaCredito = notaCredito; }

    public LocalDate getFechaCompra() { return fechaCompra; }

    public void setFechaCompra(LocalDate fechaCompra) { this.fechaCompra = fechaCompra; }
}