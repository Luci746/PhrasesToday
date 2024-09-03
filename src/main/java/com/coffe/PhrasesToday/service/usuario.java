package com.coffe.PhrasesToday.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario createUsuario(Usuario usuario) {
        // Se o campo `_id` não for definido, MongoDB gerará um ObjectId automaticamente
        return usuarioRepository.save(usuario);
    }
}
