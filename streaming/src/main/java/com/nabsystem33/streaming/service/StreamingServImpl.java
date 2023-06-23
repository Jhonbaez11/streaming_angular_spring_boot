package com.nabsystem33.streaming.service;

import com.nabsystem33.streaming.entity.StreamingEntity;
import com.nabsystem33.streaming.repository.StreamingRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreamingServImpl implements StreamingServices {

    private final StreamingRepo streamingRepo;

    public StreamingServImpl(StreamingRepo streamingRepo) {
        this.streamingRepo = streamingRepo;
    }

    @Override
    public List<StreamingEntity> consultarStreamings() {
        return (List<StreamingEntity>) streamingRepo.findAll();
    }

    @Override
    public StreamingEntity crearStreaming(StreamingEntity streaming) {
        return streamingRepo.save(streaming);
    }

    @Override
    public StreamingEntity modificarStreaming(int streamingId, StreamingEntity streaming) {
        StreamingEntity streamingExistente = buscarStreaming(streamingId);
        streamingExistente.setNombre(streaming.getNombre());
        streamingExistente.setValor_servicio(streaming.getValor_servicio());
        streamingExistente.setValor_perfil(streaming.getValor_perfil());
        streamingExistente.setPerfiles(streaming.getPerfiles());
        streamingExistente.setFecha_actualizacion(streaming.getFecha_actualizacion());
        streamingExistente.setFecha_actualizacion(streaming.getFecha_actualizacion());
        return streamingRepo.save(streamingExistente);
    }

    @Override
    public StreamingEntity buscarStreaming(int streamingId) {
        return streamingRepo.findById(streamingId)
                .orElseThrow(() -> new RuntimeException("Streaming no encontrado"));
    }

    @Override
    public void eliminarStreaming(int streamingId) {
        streamingRepo.deleteById(streamingId);
    }

    @Override
    public StreamingEntity consultarStreamingPorId(int streamingId) {
        return streamingRepo.findById(streamingId)
                .orElseThrow(() -> new RuntimeException("Streaming no encontrado"));
    }
}