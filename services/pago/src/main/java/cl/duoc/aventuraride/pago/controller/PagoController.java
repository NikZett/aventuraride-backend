package cl.duoc.aventuraride.pago.controller;

import cl.duoc.aventuraride.pago.model.Pago;
import cl.duoc.aventuraride.pago.service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/pagos")
public class PagoController {

    @Autowired
    private PagoService service;

    @GetMapping
    public List<Pago> listarPagos() {
        return service.obtenerTodos();
    }

    @PostMapping
    public Pago registrarPago(@RequestBody Pago pago) {
        return service.procesarPago(pago);
    }
}