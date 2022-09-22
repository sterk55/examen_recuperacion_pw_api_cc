package com.example.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.repository.model.Inventario;


@Repository
@Transactional
public class InventarioRepositoryImpl implements IInventarioRepository {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void crear(Inventario inventario) {
		// TODO Auto-generated method stub
		this.em.persist(inventario);
		
	}


}
