package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario")
    public Usuario getUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Ana");
        usuario.setApellido("Garcia");
        usuario.setEmail("alapole@gmail.com");
        usuario.setTelefono("123456789");
        return usuario;
    }
}
