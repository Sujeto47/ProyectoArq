package com.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	private String descrip;
	private int cantidad;
	private float valor;
	
	public Producto() {
	}	
	
	public Producto(String nombre, String descrip, int cantidad, float valor) {
		super();
		this.nombre = nombre;
		this.descrip = descrip;
		this.cantidad = cantidad;
		this.valor = valor;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getDescrip() {
		return descrip;
	}




	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}




	public int getCantidad() {
		return cantidad;
	}




	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}




	public float getValor() {
		return valor;
	}




	public void setValor(float valor) {
		this.valor = valor;
	}


}
