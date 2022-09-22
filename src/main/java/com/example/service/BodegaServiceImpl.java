package com.example.service;

import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.BodegaRepositoryImpl;
import com.example.repository.IBodegaRepository;
import com.example.repository.model.Bodega;

@Service
public class BodegaServiceImpl implements IBodegaService{

	
	@Autowired
	private IBodegaRepository bodegaRepositoryImpl;
	
	@Override
	public void crear(Bodega bodega) {
		// TODO Auto-generated method stub
		this.bodegaRepositoryImpl.crear(bodega);
		
	}

}
