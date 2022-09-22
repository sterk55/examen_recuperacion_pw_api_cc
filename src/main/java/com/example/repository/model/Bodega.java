package com.example.repository.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bodega")
public class Bodega implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "bod_id")
	private Integer id;
	
	@Column(name = "bod_nombre")
	private String nombre;
	
	@Column(name = "bod_numero")
	private String numero;
	
	@Column(name = "bod_direccion")
	private String direccion;
	
	@Column(name = "bod_telefono")
	private String telefono;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
}
