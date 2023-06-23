package com.nabsystem33.streaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nabsystem33.streaming.entity.SuscripcionesEntity;

public interface SuscripcionesRepo extends JpaRepository<SuscripcionesEntity, Integer> {
}