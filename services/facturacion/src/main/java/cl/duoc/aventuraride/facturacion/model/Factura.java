package main.java.cl.duoc.aventuraride.facturacion.model;

import jakarta.persistence.*;

@Entity
@Table(name = "facturas")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long pagoId;
    private Double monto;

    // Genera los Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getPagoId() { return pagoId; }
    public void setPagoId(Long pagoId) { this.pagoId = pagoId; }
    public Double getMonto() { return monto; }
    public void setMonto(Double monto) { this.monto = monto; }
}