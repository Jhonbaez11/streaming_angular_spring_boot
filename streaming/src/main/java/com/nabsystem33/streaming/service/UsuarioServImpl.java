package com.nabsystem33.streaming.service;

import com.nabsystem33.streaming.entity.UsuarioEntity;
import com.nabsystem33.streaming.repository.UsuarioRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServImpl implements UsuarioService {

    private final UsuarioRepo usuarioRepo;

    public UsuarioServImpl(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    @Override
    public List<UsuarioEntity> consultarUsuarios() {
        return (List<UsuarioEntity>) usuarioRepo.findAll();
    }

    @Override
    public UsuarioEntity crearUsuario(UsuarioEntity usuario) {
        return usuarioRepo.save(usuario);
    }

    @Override
    public UsuarioEntity modificarUsuario(int usuarioId, UsuarioEntity usuario) {
        UsuarioEntity usuarioExistente = usuarioRepo.findById(usuarioId)
                .orElseThrow(() -> new RuntimeException("No se encontró el usuario con el ID: " + usuarioId));

        usuarioExistente.setPrimer_nombre(usuario.getPrimer_nombre());
        usuarioExistente.setSegundo_nombre(usuario.getSegundo_nombre());
        usuarioExistente.setPrimer_apellido(usuario.getPrimer_apellido());
        usuarioExistente.setSegundo_apellido(usuario.getSegundo_apellido());
        usuarioExistente.setCorreo(usuario.getCorreo());
        usuarioExistente.setTelefono(usuario.getTelefono());
        usuarioExistente.setPassword(usuario.getPassword());
        usuarioExistente.setRol(usuario.getRol());
        usuarioExistente.setFecha_actualizacion(usuario.getFecha_actualizacion());
        usuarioExistente.setFecha_actualizacion(usuario.getFecha_actualizacion());

        return usuarioRepo.save(usuarioExistente);
    }

    @Override
    public UsuarioEntity buscarUsuario(int usuarioId) {
        return usuarioRepo.findById(usuarioId)
                .orElseThrow(() -> new RuntimeException("No se encontró el usuario con el ID: " + usuarioId));
    }

    @Override
    public void eliminarUsuarios(int usuarioId) {
        usuarioRepo.deleteById(usuarioId);
    }

    @Override
    public UsuarioEntity consultarUsuarioPorId(int usuarioId) {
        return usuarioRepo.findById(usuarioId).orElse(null);
    }
    
    @Override
    public UsuarioEntity loginUsuario(UsuarioEntity usuario) {
        return usuarioRepo.findByCorreoAndPassword(usuario.getCorreo(), usuario.getPassword());
    }
}