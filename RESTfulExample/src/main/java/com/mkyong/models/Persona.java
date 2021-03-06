package com.mkyong.models;

import com.mkyong.enums.GeneroEnum;

public class Persona {
	
	private String id;
	private String nombre;
	private String apellido;
	private String telefono;
	private String direccion;
	private GeneroEnum genero;
	
	public Persona() {
		super();
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public GeneroEnum getGenero() {
		return genero;
	}


	public void setGenero(GeneroEnum genero) {
		this.genero = genero;
	}


}
