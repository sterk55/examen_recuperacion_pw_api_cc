package com.example.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
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

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		TypedQuery<Producto> myQuery = this.em.createQuery("SELECT v FROM Cliente v ", Producto.class);
		return myQuery.getResultList();
	}

}
