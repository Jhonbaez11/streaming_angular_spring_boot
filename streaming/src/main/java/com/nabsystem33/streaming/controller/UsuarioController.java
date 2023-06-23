package com.nabsystem33.streaming.controller;

import com.nabsystem33.streaming.entity.UsuarioEntity;
import com.nabsystem33.streaming.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.HashMap;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity<List<UsuarioEntity>> consultarUsuarios() {
        List<UsuarioEntity> usuarios = usuarioService.consultarUsuarios();
        return ResponseEntity.ok(usuarios);
    }

    @GetMapping("/{usuarioId}")
    public ResponseEntity<UsuarioEntity> consultarUsuarioPorId(@PathVariable int usuarioId) {
        UsuarioEntity usuario = usuarioService.consultarUsuarioPorId(usuarioId);
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<UsuarioEntity> crearUsuario(@RequestBody UsuarioEntity usuario) {
        UsuarioEntity nuevoUsuario = usuarioService.crearUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoUsuario);
    }

    @PutMapping("/actualizar/{usuarioId}")
    public ResponseEntity<UsuarioEntity> modificarUsuario(@PathVariable int usuarioId,
                                                          @RequestBody UsuarioEntity usuario) {
        UsuarioEntity usuarioModificado = usuarioService.modificarUsuario(usuarioId, usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioModificado);
    }

    @GetMapping("/buscar/{usuarioId}")
    public ResponseEntity<UsuarioEntity> buscarUsuario(@PathVariable int usuarioId) {
        UsuarioEntity usuario = usuarioService.buscarUsuario(usuarioId);
        return ResponseEntity.ok(usuario);
    }

    @DeleteMapping("/eliminar/{usuarioId}")
    public ResponseEntity<Void> eliminarUsuario(@PathVariable int usuarioId) {
        usuarioService.eliminarUsuarios(usuarioId);
        return ResponseEntity.ok().build();
    }
    
    @PostMapping("/login")
    public ResponseEntity<Map<String, Object>> loginUsuario(@RequestBody UsuarioEntity usuario) {
        UsuarioEntity usuarioLogueado = usuarioService.loginUsuario(usuario);

        if (usuarioLogueado != null) {
            String token = generateToken(); // Generar token aleatorio

            Map<String, Object> response = new HashMap<>();
            response.put("mensaje", "inicio de sesión exitoso");
            response.put("primer_nombre", usuarioLogueado.getPrimer_nombre());
            response.put("rol", usuarioLogueado.getRol());
            response.put("token", token); // Agregar el token a la respuesta
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

    private String generateToken() {
        String token = UUID.randomUUID().toString();
        return token;
    }
}