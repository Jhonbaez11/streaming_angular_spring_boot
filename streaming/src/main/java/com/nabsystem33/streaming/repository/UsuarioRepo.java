package com.nabsystem33.streaming.repository;

import com.nabsystem33.streaming.entity.UsuarioEntity;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepo extends CrudRepository<UsuarioEntity, Integer> {

	UsuarioEntity findByCorreoAndPassword(String correo, String password);

}