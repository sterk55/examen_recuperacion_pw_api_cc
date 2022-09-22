package com.example.service;

import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.IProductoRepository;
import com.example.repository.ProductoRepositoryImpl;
import com.example.repository.model.Producto;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepository productoRepositoryImpl;
	
	@Override
	public void crear(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepositoryImpl.crear(producto);
		
	}

}
