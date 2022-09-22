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

import com.example.repository.model.Bodega;
import com.example.service.IBodegaService;

@RestController
@RequestMapping("/bodegas")
@CrossOrigin("http://localhost:8080/")
public class BodegaRestFullController {
	
	@Autowired
	private IBodegaService bodegaService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> crear(@RequestBody Bodega bodega){
		
		try {
			this.bodegaService.crear(bodega);
			return ResponseEntity.ok("Bodega insertada correctamente");
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Bodega no insertada...");
		}
	}

}
