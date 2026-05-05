package cl.duoc.aventuraride.cliente.controller;

import cl.duoc.aventuraride.cliente.model.Cliente;
import cl.duoc.aventuraride.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public List<Cliente> listarClientes() {
        return service.obtenerTodos();
    }

    @PostMapping
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return service.guardarCliente(cliente);
    }
}