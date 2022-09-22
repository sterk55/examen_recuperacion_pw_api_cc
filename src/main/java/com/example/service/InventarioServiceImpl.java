package com.example.service;

import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.IInventarioRepository;
import com.example.repository.InventarioRepositoryImpl;
import com.example.repository.model.Inventario;

@Service
public class InventarioServiceImpl implements IInventarioService {

	
	@Autowired
	private IInventarioRepository inventarioRepositoryImpl;
	
	@Override
	public void crear(Inventario inventario) {
		// TODO Auto-generated method stub
		this.inventarioRepositoryImpl.crear(inventario);
		
	}

}
