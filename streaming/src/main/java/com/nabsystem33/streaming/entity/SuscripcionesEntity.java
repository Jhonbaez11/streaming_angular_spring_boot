package com.nabsystem33.streaming.entity;

import java.sql.Timestamp;

import jakarta.persistence.*;

@Entity
@Table(name = "suscripciones")
public class SuscripcionesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "suscripciones_id")
    private Integer suscripciones_id;

    @Column(name = "id_usuario")
    private Integer id_usuario;

    @Column(name = "id_streaming")
    private Integer id_streaming;

    @Column(name = "perfiles_contratados")
    private Integer perfiles_contratados;

    @Column(name = "cuenta_completa")
    private Boolean cuenta_completa;

    @Column(name = "usuario_servicio")
    private String usuario_servicio;

    @Column(name = "password_servicio")
    private String password_servicio;

    @Column(name = "fecha_creacion")
    private Timestamp fecha_creacion;

    @Column(name = "usuario_creacion")
    private String usuario_creacion;

    @Column(name = "fecha_actualizacion")
    private Timestamp fecha_actualizacion;

    @Column(name = "usuario_actualizacion")
    private String usuario_actualizacion;

    public SuscripcionesEntity() {
    }

    // Getters and Setters
    public Integer getSuscripciones_id() {
        return suscripciones_id;
    }

    public void setSuscripciones_id(Integer suscripciones_id) {
        this.suscripciones_id = suscripciones_id;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Integer getId_streaming() {
        return id_streaming;
    }

    public void setId_streaming(Integer id_streaming) {
        this.id_streaming = id_streaming;
    }

    public Integer getPerfiles_contratados() {
        return perfiles_contratados;
    }

    public void setPerfiles_contratados(Integer perfiles_contratados) {
        this.perfiles_contratados = perfiles_contratados;
    }

    public Boolean getCuenta_completa() {
        return cuenta_completa;
    }

    public void setCuenta_completa(Boolean cuenta_completa) {
        this.cuenta_completa = cuenta_completa;
    }

    public String getUsuario_servicio() {
        return usuario_servicio;
    }

    public void setUsuario_servicio(String usuario_servicio) {
        this.usuario_servicio = usuario_servicio;
    }

    public String getPassword_servicio() {
        return password_servicio;
    }

    public void setPassword_servicio(String password_servicio) {
        this.password_servicio = password_servicio;
    }

    public Timestamp getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Timestamp fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getUsuario_creacion() {
        return usuario_creacion;
    }

    public void setUsuario_creacion(String usuario_creacion) {
        this.usuario_creacion = usuario_creacion;
    }

    public Timestamp getFecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setFecha_actualizacion(Timestamp fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public String getUsuario_actualizacion() {
        return usuario_actualizacion;
    }

    public void setUsuario_actualizacion(String usuario_actualizacion) {
        this.usuario_actualizacion = usuario_actualizacion;
    }
   
}