package com.example.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.repository.model.Producto;

@Repository
@Transactional
public class ProductoRepositoryImpl implements IProductoRepository{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void crear(Producto producto) {
		// TODO Auto-generated method stub
		this.em.persist(producto);
		
	}

}
