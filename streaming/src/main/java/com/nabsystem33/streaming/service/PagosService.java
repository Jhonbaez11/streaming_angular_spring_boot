package com.nabsystem33.streaming.service;

import com.nabsystem33.streaming.entity.PagosEntity;

import java.util.List;

public interface PagosService {

    public List<PagosEntity> consultarPagos();
    public PagosEntity crearPagos(PagosEntity pagos);
    public PagosEntity modificarPagos(int pagos_id, PagosEntity pagos);
    public PagosEntity buscarPagos(int pagos_id);
    public void eliminarPagos(int pagos_id);
    PagosEntity consultarPagoPorId(int pagos_id);
}
