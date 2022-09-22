package com.example.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.repository.model.Bodega;

@Repository
@Transactional
public class BodegaRepositoryImpl implements IBodegaRepository{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void crear(Bodega bodega) {
		// TODO Auto-generated method stub
		this.em.persist(bodega);
	}

}
