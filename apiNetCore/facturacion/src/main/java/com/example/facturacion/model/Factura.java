package com.example.facturacion.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "facturas")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreCliente;
    private String direccionCliente;
    private String correoCliente;
    private String codigoPostal;

    @Column(unique = true)
    private String numeroFactura; 
    
    private Long pedidoId; 
    private BigDecimal total;
    private LocalDateTime fechaFactura;

    // Constructor vacío obligatorio
    public Factura() {}

    @PrePersist
    protected void onCreate() {
        this.fechaFactura = LocalDateTime.now();
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombreCliente() { return nombreCliente; }
    public void setNombreCliente(String nc) { this.nombreCliente = nc; }
    public String getDireccionCliente() { return direccionCliente; }
    public void setDireccionCliente(String dc) { this.direccionCliente = dc; }
    public String getCorreoCliente() { return correoCliente; }
    public void setCorreoCliente(String cc) { this.correoCliente = cc; }
    public String getCodigoPostal() { return codigoPostal; }
    public void setCodigoPostal(String cp) { this.codigoPostal = cp; }
    public String getNumeroFactura() { return numeroFactura; }
    public void setNumeroFactura(String nf) { this.numeroFactura = nf; }
    public Long getPedidoId() { return pedidoId; }
    public void setPedidoId(Long pid) { this.pedidoId = pid; }
    public BigDecimal getTotal() { return total; }
    public void setTotal(BigDecimal t) { this.total = t; }
    public LocalDateTime getFechaFactura() { return fechaFactura; }
    public void setFechaFactura(LocalDateTime ff) { this.fechaFactura = ff; }
}