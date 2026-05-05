package cl.duoc.aventuraride.reserva.service;

import cl.duoc.aventuraride.reserva.model.Reserva;
import cl.duoc.aventuraride.reserva.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository repository;

    public List<Reserva> obtenerTodas() {
        return repository.findAll();
    }

    public Reserva crearReserva(Reserva reserva) {
        return repository.save(reserva);
    }
}