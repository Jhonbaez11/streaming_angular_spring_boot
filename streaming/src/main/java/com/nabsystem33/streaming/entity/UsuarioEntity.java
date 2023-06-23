package com.nabsystem33.streaming.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class UsuarioEntity {

    @Id
    @Column(name = "usuario_id", unique = true)  // Se establece como único
    private int usuario_id;
    
    @Column(name = "primer_nombre")
    private String primer_nombre;
    
    @Column(name = "segundo_nombre")
    private String segundo_nombre;
    
    @Column(name = "primer_apellido")
    private String primer_apellido;
    
    @Column(name = "segundo_apellido")
    private String segundo_apellido;
    
    @Column(name = "correo")
    private String correo;
    
    @Column(name = "telefono")  // Se agrega el campo "telefono" de tipo int
    private int telefono;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "rol")
    private int rol;
    
    @Column(name = "fecha_creacion")
    private LocalDateTime fecha_creacion;
    
    @Column(name = "usuario_creacion")
    private String usuario_creacion;
    
    @Column(name = "fecha_actualizacion")
    private LocalDateTime fecha_actualizacion;
    
    @Column(name = "usuario_actualizacion")
    private String usuario_actualizacion;

    // getters and setters

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
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