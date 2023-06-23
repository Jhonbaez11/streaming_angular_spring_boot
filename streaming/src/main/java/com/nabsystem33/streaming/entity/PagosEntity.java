package com.nabsystem33.streaming.entity;

import java.sql.Timestamp;

import jakarta.persistence.*;

@Entity
@Table(name = "pagos")
public class PagosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pagos_id")
    private Integer pagos_id;

    @Column(name = "id_suscripcion")
    private Integer id_suscripcion;

    @Column(name = "mes")
    private Integer mes;

    @Column(name = "anio")
    private Integer anio;

    @Column(name = "pago")
    private Double pago;

    @Column(name = "fecha_creacion")
    private Timestamp fecha_creacion;

    @Column(name = "usuario_creacion")
    private String usuario_creacion;

    @Column(name = "fecha_actualizacion")
    private Timestamp fecha_actualizacion;

    @Column(name = "usuario_actualizacion")
    private String usuario_actualizacion;

    //getters and setters
    public Integer getPagos_id() {
        return pagos_id;
    }

    public void setPagos_id(Integer pagos_id) {
        this.pagos_id = pagos_id;
    }

    public Integer getId_suscripcion() {
        return id_suscripcion;
    }

    public void setId_suscripcion(Integer id_suscripcion) {
        this.id_suscripcion = id_suscripcion;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Double getPago() {
        return pago;
    }

    public void setPago(Double pago) {
        this.pago = pago;
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