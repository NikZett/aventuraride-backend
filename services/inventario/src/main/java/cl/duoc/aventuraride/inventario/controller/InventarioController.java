package cl.duoc.aventuraride.inventario.controller;

import cl.duoc.aventuraride.inventario.model.Vehiculo;
import cl.duoc.aventuraride.inventario.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {

    @Autowired
    private VehiculoService service;

    @GetMapping
    public List<Vehiculo> listarVehiculos() {
        return service.obtenerTodos();
    }

    @PostMapping
    public Vehiculo crearVehiculo(@RequestBody Vehiculo vehiculo) {
        return service.guardarVehiculo(vehiculo);
    }
}