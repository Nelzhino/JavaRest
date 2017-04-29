package com.mkyong.models;

public class Medicamento {

	private int id;
	private String nombre;
	private int posologia;
	
	public Medicamento() {
		super();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPosologia() {
		return posologia;
	}
	public void setPosologia(int posologia) {
		this.posologia = posologia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
