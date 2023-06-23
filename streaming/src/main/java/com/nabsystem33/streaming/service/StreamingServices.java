package com.nabsystem33.streaming.service;

import com.nabsystem33.streaming.entity.StreamingEntity;

import java.util.List;

public interface StreamingServices {

    List<StreamingEntity> consultarStreamings();

    StreamingEntity crearStreaming(StreamingEntity streaming);

    StreamingEntity modificarStreaming(int streamingId, StreamingEntity streaming);

    StreamingEntity buscarStreaming(int streamingId);

    void eliminarStreaming(int streamingId);

    StreamingEntity consultarStreamingPorId(int streamingId);
}