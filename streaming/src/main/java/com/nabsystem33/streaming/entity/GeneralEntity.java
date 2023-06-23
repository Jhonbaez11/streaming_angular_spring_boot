package com.nabsystem33.streaming.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GeneralEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String primer_nombre;
    private String primer_apellido;
    private String nombre_streaming;
    private double valor_servicio;
    private double valor_perfil;
    private int perfiles_contratados;
    private int cuenta_completa;
    private int mes;
    private int anio;
    private double total_pago;
    private double total_pagar;
	public Long getId() {
		return id;
	}
	
	// Constructor, getters, and setters
	public String getPrimer_nombre() {
		return primer_nombre;
	}
	public void setPrimer_nombre(String primer_nombre) {
		this.primer_nombre = primer_nombre;
	}
	public String getPrimer_apellido() {
		return primer_apellido;
	}
	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}
	public String getNombre_streaming() {
		return nombre_streaming;
	}
	public void setNombre_streaming(String nombre_streaming) {
		this.nombre_streaming = nombre_streaming;
	}
	public double getValor_servicio() {
		return valor_servicio;
	}
	public void setValor_servicio(double valor_servicio) {
		this.valor_servicio = valor_servicio;
	}
	public double getValor_perfil() {
		return valor_perfil;
	}
	public void setValor_perfil(double valor_perfil) {
		this.valor_perfil = valor_perfil;
	}
	public int getPerfiles_contratados() {
		return perfiles_contratados;
	}
	public void setPerfiles_contratados(int perfiles_contratados) {
		this.perfiles_contratados = perfiles_contratados;
	}
	public int getCuenta_completa() {
		return cuenta_completa;
	}
	public void setCuenta_completa(int cuenta_completa) {
		this.cuenta_completa = cuenta_completa;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public double getTotal_pago() {
		return total_pago;
	}
	public void setTotal_pago(double total_pago) {
		this.total_pago = total_pago;
	}
	public double getTotal_pagar() {
		return total_pagar;
	}
	public void setTotal_pagar(double total_pagar) {
		this.total_pagar = total_pagar;
	}
	public void setId(Long id) {
		this.id = id;
	}	
}