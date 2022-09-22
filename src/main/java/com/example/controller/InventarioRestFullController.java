package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.repository.model.Inventario;
import com.example.repository.model.Producto;
import com.example.service.IInventarioService;

@RestController
@RequestMapping("/inventarios")
@CrossOrigin("http://localhost:8080/")
public class InventarioRestFullController {

	
	
	@Autowired
	private IInventarioService inventarioService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> crear(@RequestBody Inventario inventario){
		try {
			this.inventarioService.crear(inventario);
			return ResponseEntity.ok("Inventario insertado correctamente");
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Inventario no insertado...");
		}
	}
}
