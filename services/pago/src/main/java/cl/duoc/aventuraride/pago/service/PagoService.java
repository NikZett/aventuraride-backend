package cl.duoc.aventuraride.pago.service;

import cl.duoc.aventuraride.pago.model.Pago;
import cl.duoc.aventuraride.pago.repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PagoService {

    @Autowired
    private PagoRepository repository;

    public List<Pago> obtenerTodos() {
        return repository.findAll();
    }

    public Pago procesarPago(Pago pago) {
        return repository.save(pago);
    }
}