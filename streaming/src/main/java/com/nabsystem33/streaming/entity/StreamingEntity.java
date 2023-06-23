package com.nabsystem33.streaming.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "streaming")
public class StreamingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "streaming_id", unique = true)
    private Integer streaming_id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "valor_servicio")
    private BigDecimal valor_servicio;
    
    @Column(name = "valor_perfil")
    private BigDecimal valor_perfil;
    
    @Column(name = "perfiles")
    private Integer perfiles;
    
    @Column(name = "fecha_creacion")
    private LocalDateTime fecha_creacion;
    
    @Column(name = "usuario_creacion")
    private String usuario_creacion;
    
    @Column(name = "fecha_actualizacion")
    private LocalDateTime fecha_actualizacion;
    
    @Column(name = "usuario_actualizacion")
    private String usuario_actualizacion;

    // getters and setters
    public Integer getStreaming_id() {
        return streaming_id;
    }

    public void setStreaming_id(Integer streaming_id) {
        this.streaming_id = streaming_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getValor_servicio() {
        return valor_servicio;
    }

    public void setValor_servicio(BigDecimal valor_servicio) {
        this.valor_servicio = valor_servicio;
    }

    public BigDecimal getValor_perfil() {
        return valor_perfil;
    }

    public void setValor_perfil(BigDecimal valor_perfil) {
        this.valor_perfil = valor_perfil;
    }

    public Integer getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(Integer perfiles) {
        this.perfiles = perfiles;
    }

    public LocalDateTime getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDateTime fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getUsuario_creacion() {
        return usuario_creacion;
    }

    public void setUsuario_creacion(String usuario_creacion) {
        this.usuario_creacion = usuario_creacion;
    }

    public LocalDateTime getFecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setFecha_actualizacion(LocalDateTime fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public String getUsuario_actualizacion() {
        return usuario_actualizacion;
    }

    public void setUsuario_actualizacion(String usuario_actualizacion) {
        this.usuario_actualizacion = usuario_actualizacion;
    }
   
}