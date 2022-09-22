package com.example.repository.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Producto")
public class Producto implements Serializable{

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "pro_id")
	private Integer id;
	
	@Column(name = "pro_nombre")
	private String nombre;
	
	@Column(name = "pro_codigo_maestro")
	private String CodigoMaestro;
	
	@Column(name = "pro_stock")
	private Integer stock;

	@Column(name = "pro_categoria")
	private String categoria;
	 
	
	


	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

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

	public String getCodigoMaestro() {
		return CodigoMaestro;
	}

	public void setCodigoMaestro(String codigoMaestro) {
		CodigoMaestro = codigoMaestro;
	}
	
	

}
