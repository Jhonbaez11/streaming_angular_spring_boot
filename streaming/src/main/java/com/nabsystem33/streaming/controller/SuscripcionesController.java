package com.nabsystem33.streaming.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nabsystem33.streaming.entity.SuscripcionesEntity;
import com.nabsystem33.streaming.service.SuscripcionesService;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/suscripciones")
public class SuscripcionesController {

    private final SuscripcionesService suscripcionesService;

    public SuscripcionesController(SuscripcionesService suscripcionesService) {
        this.suscripcionesService = suscripcionesService;
    }

    @GetMapping
    public ResponseEntity<List<SuscripcionesEntity>> getSuscripciones() {
        List<SuscripcionesEntity> suscripciones = suscripcionesService.getAllSuscripciones();
        return ResponseEntity.ok(suscripciones);
    }

    @GetMapping("/{suscripcionesId}")
    public ResponseEntity<SuscripcionesEntity> getSuscripcionById(@PathVariable int suscripcionesId) {
        SuscripcionesEntity suscripcion = suscripcionesService.getSuscripcionById(suscripcionesId);
        if (suscripcion != null) {
            return ResponseEntity.ok(suscripcion);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<SuscripcionesEntity> createSuscripcion(@RequestBody SuscripcionesEntity suscripcion) {
        SuscripcionesEntity nuevaSuscripcion = suscripcionesService.createSuscripcion(suscripcion);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaSuscripcion);
    }

    @PutMapping("/actualizar/{suscripcionesId}")
    public ResponseEntity<SuscripcionesEntity> updateSuscripcion(@PathVariable int suscripcionesId, @RequestBody SuscripcionesEntity suscripcion) {
        SuscripcionesEntity suscripcionExistente = suscripcionesService.getSuscripcionById(suscripcionesId);
        if (suscripcionExistente != null) {
            suscripcion.setSuscripciones_id(suscripcionExistente.getSuscripciones_id());
            SuscripcionesEntity suscripcionActualizada = suscripcionesService.updateSuscripcion(suscripcion);
            return ResponseEntity.status(HttpStatus.CREATED).body(suscripcionActualizada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/eliminar/{suscripcionesId}")
    public ResponseEntity<Void> deleteSuscripcion(@PathVariable int suscripcionesId) {
        SuscripcionesEntity suscripcion = suscripcionesService.getSuscripcionById(suscripcionesId);
        if (suscripcion != null) {
            suscripcionesService.deleteSuscripcion(suscripcionesId);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}