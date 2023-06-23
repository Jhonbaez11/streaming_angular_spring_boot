package com.nabsystem33.streaming.service;

import java.util.List;

import com.nabsystem33.streaming.entity.SuscripcionesEntity;

public interface SuscripcionesService {
    List<SuscripcionesEntity> getAllSuscripciones();
    SuscripcionesEntity getSuscripcionById(Integer suscripcionesId);
    SuscripcionesEntity createSuscripcion(SuscripcionesEntity suscripcion);
    SuscripcionesEntity updateSuscripcion(SuscripcionesEntity suscripcion);
    void deleteSuscripcion(Integer suscripcionesId);
}