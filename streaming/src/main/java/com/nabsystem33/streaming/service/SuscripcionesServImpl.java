package com.nabsystem33.streaming.service;

import org.springframework.stereotype.Service;

import com.nabsystem33.streaming.entity.SuscripcionesEntity;
import com.nabsystem33.streaming.repository.SuscripcionesRepo;

import java.util.List;

@Service
public class SuscripcionesServImpl implements SuscripcionesService {

    private final SuscripcionesRepo suscripcionesRepo;

    public SuscripcionesServImpl(SuscripcionesRepo suscripcionesRepo) {
        this.suscripcionesRepo = suscripcionesRepo;
    }

    @Override
    public List<SuscripcionesEntity> getAllSuscripciones() {
        return suscripcionesRepo.findAll();
    }

    @Override
    public SuscripcionesEntity getSuscripcionById(Integer suscripcionesId) {
        return suscripcionesRepo.findById(suscripcionesId).orElse(null);
    }

    @Override
    public SuscripcionesEntity createSuscripcion(SuscripcionesEntity suscripcion) {
        return suscripcionesRepo.save(suscripcion);
    }

    @Override
    public SuscripcionesEntity updateSuscripcion(SuscripcionesEntity suscripcion) {
        SuscripcionesEntity existingSuscripcion = suscripcionesRepo.findById(suscripcion.getSuscripciones_id())
                .orElseThrow(() -> new RuntimeException("No se encontró la suscripción con el ID: " + suscripcion.getSuscripciones_id()));

        existingSuscripcion.setId_usuario(suscripcion.getId_usuario());
        existingSuscripcion.setId_streaming(suscripcion.getId_streaming());
        existingSuscripcion.setPerfiles_contratados(suscripcion.getPerfiles_contratados());
        existingSuscripcion.setCuenta_completa(suscripcion.getCuenta_completa());
        existingSuscripcion.setUsuario_servicio(suscripcion.getUsuario_servicio());
        existingSuscripcion.setPassword_servicio(suscripcion.getPassword_servicio());
        existingSuscripcion.setFecha_creacion(suscripcion.getFecha_creacion());
        existingSuscripcion.setUsuario_creacion(suscripcion.getUsuario_creacion());
        existingSuscripcion.setFecha_actualizacion(suscripcion.getFecha_actualizacion());
        existingSuscripcion.setUsuario_actualizacion(suscripcion.getUsuario_actualizacion());

        return suscripcionesRepo.save(existingSuscripcion);
    }

    @Override
    public void deleteSuscripcion(Integer suscripcionesId) {
        suscripcionesRepo.deleteById(suscripcionesId);
    }
}