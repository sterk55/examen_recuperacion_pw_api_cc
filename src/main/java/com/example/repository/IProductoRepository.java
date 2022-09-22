package com.example.repository;

import java.util.List;

import com.example.repository.model.Producto;

public interface IProductoRepository {

	public void crear(Producto producto);
	public List<Producto> findAll();
}
