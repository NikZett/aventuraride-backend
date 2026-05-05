package cl.duoc.aventuraride.auth.service;

import cl.duoc.aventuraride.auth.model.Usuario;
import cl.duoc.aventuraride.auth.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> obtenerTodos() {
        return repository.findAll();
    }

    public Usuario guardarUsuario(Usuario usuario) {
        return repository.save(usuario);
    }
}