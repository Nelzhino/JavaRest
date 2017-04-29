package com.mkyong.models;

import java.util.List;

public class Enfermera extends Persona {

	private List<Paciente> pacientes;
	private List<Turno> turnos;
	
	
	
	public Enfermera() {
		super();
	}
	
	
	public List<Paciente> getPacientes() {
		return pacientes;
	}
	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	public List<Turno> getTurnos() {
		return turnos;
	}
	public void setTurnos(List<Turno> turnos) {
		this.turnos = turnos;
	}
	
	

}
