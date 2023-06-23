package com.nabsystem33.streaming.controller;

import com.nabsystem33.streaming.entity.StreamingEntity;
import com.nabsystem33.streaming.service.StreamingServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/streamings")
public class StreamingController {

    private final StreamingServices streamingService;

    public StreamingController(StreamingServices streamingService) {
        this.streamingService = streamingService;
    }

    @GetMapping
    public ResponseEntity<List<StreamingEntity>> consultarStreamings() {
        List<StreamingEntity> streamings = streamingService.consultarStreamings();
        return new ResponseEntity<>(streamings, HttpStatus.OK);
    }

    @PostMapping ("/crear")
    public ResponseEntity<StreamingEntity> crearStreaming(@RequestBody StreamingEntity streaming) {
        StreamingEntity nuevoStreaming = streamingService.crearStreaming(streaming);
        return new ResponseEntity<>(nuevoStreaming, HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{streamingId}")
    public ResponseEntity<StreamingEntity> modificarStreaming(@PathVariable int streamingId, @RequestBody StreamingEntity streaming) {
        StreamingEntity streamingModificado = streamingService.modificarStreaming(streamingId, streaming);
        return new ResponseEntity<>(streamingModificado, HttpStatus.OK);
    }

    @GetMapping("/buscar/{streamingId}")
    public ResponseEntity<StreamingEntity> buscarStreaming(@PathVariable int streamingId) {
        StreamingEntity streaming = streamingService.buscarStreaming(streamingId);
        return new ResponseEntity<>(streaming, HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{streamingId}")
    public ResponseEntity<Void> eliminarStreaming(@PathVariable int streamingId) {
        streamingService.eliminarStreaming(streamingId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/streamings/{streamingId}/detalles")
    public ResponseEntity<StreamingEntity> consultarStreamingPorId(@PathVariable int streamingId) {
        StreamingEntity streaming = streamingService.consultarStreamingPorId(streamingId);
        return new ResponseEntity<>(streaming, HttpStatus.OK);
    }
}