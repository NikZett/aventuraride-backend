package cl.duoc.aventuraride.auth.controller;

import cl.duoc.aventuraride.auth.model.Usuario;
import cl.duoc.aventuraride.auth.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UsuarioService service;

    @GetMapping("/usuarios")
    public List<Usuario> listarUsuarios() {
        return service.obtenerTodos();
    }

    @PostMapping("/registro")
    public Usuario registrarUsuario(@RequestBody Usuario usuario) {
        return service.guardarUsuario(usuario);
    }
}