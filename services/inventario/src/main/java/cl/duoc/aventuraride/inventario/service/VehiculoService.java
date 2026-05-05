package cl.duoc.aventuraride.inventario.service;

import cl.duoc.aventuraride.inventario.model.Vehiculo;
import cl.duoc.aventuraride.inventario.repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VehiculoService {

    @Autowired
    private VehiculoRepository repository;

    public List<Vehiculo> obtenerTodos() {
        return repository.findAll();
    }

    public Vehiculo guardarVehiculo(Vehiculo vehiculo) {
        return repository.save(vehiculo);
    }
}