package main.java.cl.duoc.aventuraride.facturacion.controller;

import cl.duoc.aventuraride.facturacion.model.Factura;
import cl.duoc.aventuraride.facturacion.service.FacturaService;
import cl.duoc.aventuraride.facturacion.dto.FacturaDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facturacion")
public class FacturaController {

    @Autowired
    private FacturaService service;

    @GetMapping
    public ResponseEntity<List<Factura>> listar() {
        return ResponseEntity.ok(service.listarTodas());
    }

    @PostMapping
    public ResponseEntity<Factura> crearFactura(@Valid @RequestBody FacturaDTO dto) {
        Factura factura = new Factura();
        factura.setPagoId(dto.getPagoId());
        factura.setMonto(dto.getMonto());
        
        Factura nuevaFactura = service.guardar(factura);
        return new ResponseEntity<>(nuevaFactura, HttpStatus.CREATED);
    }
}