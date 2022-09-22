package com.example.repository.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Inventario")
public class Inventario implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ive_id")
	private Integer id;
	
	@Column(name = "ive_cantidad")
	private Integer cantidad;
	
	@Column(name = "ive_codigo_individual")
	private String codigoIndividual;
	
	@Column(name = "ive_codigo_maestro")
	private String codigoMaestro;
	
	@Column(name = "ive_numero_bodega")
	private String numeroBodega;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getCodigoIndividual() {
		return codigoIndividual;
	}

	public void setCodigoIndividual(String codigoIndividual) {
		this.codigoIndividual = codigoIndividual;
	}

	public String getCodigoMaestro() {
		return codigoMaestro;
	}

	public void setCodigoMaestro(String codigoMaestro) {
		this.codigoMaestro = codigoMaestro;
	}

	public String getNumeroBodega() {
		return numeroBodega;
	}

	public void setNumeroBodega(String numeroBodega) {
		this.numeroBodega = numeroBodega;
	}
	
	
	

}
