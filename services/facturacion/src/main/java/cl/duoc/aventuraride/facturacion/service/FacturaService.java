package main.java.cl.duoc.aventuraride.facturacion.service;

import cl.duoc.aventuraride.facturacion.model.Factura;
import cl.duoc.aventuraride.facturacion.repository.FacturaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaService {

    private static final Logger logger = LoggerFactory.getLogger(FacturaService.class);

    @Autowired
    private FacturaRepository repository;

    public Factura guardar(Factura factura) {
        logger.info("Guardando nueva factura para el pago ID: {}", factura.getPagoId());
        return repository.save(factura);
    }

    public List<Factura> listarTodas() {
        return repository.findAll();
    }
}