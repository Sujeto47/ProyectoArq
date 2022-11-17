package com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.model.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
