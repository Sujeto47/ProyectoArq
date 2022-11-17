package com.backend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.Country;
import com.backend.service.CountryService;

@RestController
@RequestMapping("/country/")
public class CountryREST {
	@Autowired
	private CountryService countryService;
	
	@GetMapping
	private ResponseEntity<List<Country>> getAllCountries (){
		return ResponseEntity.ok(countryService.findAll());
	}

}
