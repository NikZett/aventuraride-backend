package main.java.cl.duoc.aventuraride.facturacion.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class FacturaDTO {

    @NotNull(message = "El ID del pago no puede ser nulo")
    private Long pagoId;

    @NotNull(message = "El monto es obligatorio")
    @Positive(message = "El monto debe ser mayor a cero")
    private Double monto;

    
    public Long getPagoId() { return pagoId; }
    public void setPagoId(Long pagoId) { this.pagoId = pagoId; }
    public Double getMonto() { return monto; }
    public void setMonto(Double monto) { this.monto = monto; }
}