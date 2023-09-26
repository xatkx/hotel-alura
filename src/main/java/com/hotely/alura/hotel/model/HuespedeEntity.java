package com.hotely.alura.hotel.model;

import java.util.List;

import javax.persistence.*;

@Entity(name="HuespedeEntity")
@Table(name="huspedes")
public class HuespedeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nombre;
	private String fechaNacimiento;
	private String nacionalidad;
	private String telefono;
	
	@OneToMany(fetch = FetchType.LAZY )
	List<ReservaEntity> Reservas;

	public HuespedeEntity() {
		
	}

	public HuespedeEntity(long id, String nombre, String fechaNacimiento, String nacionalidad, String telefono,
			ReservaEntity reservas) {

		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.telefono = telefono;
		Reservas.add(reservas);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<ReservaEntity> getReservas() {
		return Reservas;
	}

	public void setReservas(ReservaEntity reservas) {
		Reservas.add(reservas);
	}
	
	
}
