package com.nabsystem33.streaming.service;

import com.nabsystem33.streaming.entity.UsuarioEntity;

import java.util.List;

public interface UsuarioService {

    List<UsuarioEntity> consultarUsuarios();

    UsuarioEntity crearUsuario(UsuarioEntity usuario);

    UsuarioEntity modificarUsuario(int usuarioId, UsuarioEntity usuario);

    UsuarioEntity buscarUsuario(int usuarioId);

    void eliminarUsuarios(int usuarioId);

    UsuarioEntity consultarUsuarioPorId(int usuarioId);

	UsuarioEntity loginUsuario(UsuarioEntity usuario);
}