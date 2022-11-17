package com.backend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.Estado;
import com.backend.service.EstadoService;

@RestController
@RequestMapping("/estado/")
public class EstadoREST {
	
	@Autowired
	private EstadoService estadoService;
	@GetMapping ("{id}")
	private ResponseEntity<List<Estado>> getAllEstadosByCountry (@PathVariable("id") long idCountry){
		return ResponseEntity.ok(estadoService.findAllByCountry(idCountry));
	}

}
