package cl.duoc.aventuraride.reserva.controller;

import cl.duoc.aventuraride.reserva.model.Reserva;
import cl.duoc.aventuraride.reserva.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

    @Autowired
    private ReservaService service;

    @GetMapping
    public List<Reserva> listarReservas() {
        return service.obtenerTodas();
    }

    @PostMapping
    public Reserva nuevaReserva(@RequestBody Reserva reserva) {
        return service.crearReserva(reserva);
    }
}