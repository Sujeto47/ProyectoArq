package com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
