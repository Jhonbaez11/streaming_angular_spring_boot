package com.nabsystem33.streaming.controller;

import com.nabsystem33.streaming.entity.PagosEntity;
import com.nabsystem33.streaming.service.PagosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("pagos")
public class PagosController {

    @Autowired
    private PagosService pagosService;

    @GetMapping
    public ResponseEntity<List<PagosEntity>> consultarPagos() {
        List<PagosEntity> pagosList = pagosService.consultarPagos();
        return ResponseEntity.ok(pagosList);
    }
    
    @GetMapping("/{pagos_id}")
    public ResponseEntity<?> consultarPagoPorId(@PathVariable int pagos_id) {
    	PagosEntity pago = this.pagosService.consultarPagoPorId(pagos_id);
        if (pago != null) {
            return ResponseEntity.ok(pago);
        } else {
            return ResponseEntity.notFound().build();
        }
    } 

    @PostMapping("/crear")
    public ResponseEntity<PagosEntity> crearPago(@RequestBody PagosEntity pago) {
        PagosEntity pagoCreado = pagosService.crearPagos(pago);
        return ResponseEntity.status(HttpStatus.CREATED).body(pagoCreado);
    }

    @PutMapping("/actualizar/{pagos_id}")
    public ResponseEntity<PagosEntity> modificarPago(@PathVariable int pagos_id, @RequestBody PagosEntity pago) {
        PagosEntity pagoModificado = pagosService.modificarPagos(pagos_id, pago);
        return ResponseEntity.status(HttpStatus.CREATED).body(pagoModificado);
    }

    @GetMapping("/buscar/{pagos_id}")
    public ResponseEntity<PagosEntity> buscarPago(@PathVariable int pagos_id) {
        PagosEntity pago = pagosService.buscarPagos(pagos_id);
        if (pago != null) {
            return ResponseEntity.ok(pago);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/eliminar/{pagos_id}")
    public ResponseEntity<Void> eliminarPago(@PathVariable int pagos_id) {
        pagosService.eliminarPagos(pagos_id);
        return ResponseEntity.ok().build();
    }
}