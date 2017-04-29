package com.mkyong.models;

import com.mkyong.enums.DiasEnum;

public class Turno {
	
	private DiasEnum dias;
	private int intensidadHoraria;
	
	
	
	public Turno() {
		super();
	}
		
	public DiasEnum getDias() {
		return dias;
	}
	public void setDias(DiasEnum dias) {
		this.dias = dias;
	}
	public int getIntensidadHoraria() {
		return intensidadHoraria;
	}
	public void setIntensidadHoraria(int intensidadHoraria) {
		this.intensidadHoraria = intensidadHoraria;
	}
	
	
}
