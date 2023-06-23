package com.nabsystem33.streaming.service;

import com.nabsystem33.streaming.entity.PagosEntity;
import com.nabsystem33.streaming.repository.PagosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagosServImpl implements PagosService {

    @Autowired
    private PagosRepo repo;

    @Override
    public List<PagosEntity> consultarPagos() {
        return (List<PagosEntity>) this.repo.findAll();
    }

    @Override
    public PagosEntity consultarPagoPorId(int pagos_id) {
        return this.repo.findById(pagos_id).orElse(null);
    }

    @Override
    public PagosEntity crearPagos(PagosEntity pagos) {
        return this.repo.save(pagos);
    }

    @Override
    public PagosEntity modificarPagos(int pagos_id, PagosEntity pagos) {
        PagosEntity pagosExistente = this.repo.findById(pagos_id).orElse(null);

        if (pagosExistente != null) {
            pagosExistente.setMes(pagos.getMes());
            pagosExistente.setAnio(pagos.getAnio());
            pagosExistente.setPago(pagos.getPago());
            pagosExistente.setFecha_actualizacion(pagos.getFecha_actualizacion());
            pagosExistente.setFecha_actualizacion(pagos.getFecha_actualizacion());
            // Actualiza otros atributos de pagosExistente según sea necesario

            return this.repo.save(pagosExistente);
        } else {
            // Manejo de caso en que no se encuentra el pago con el ID proporcionado
            throw new RuntimeException("No se encontró el pago con el ID: " + pagos_id);
        }
    }

    @Override
    public PagosEntity buscarPagos(int pagos_id) {
        return this.repo.findById(pagos_id).orElse(null);
    }

    @Override
    public void eliminarPagos(int pagos_id) {
        this.repo.deleteById(pagos_id);
    }
}