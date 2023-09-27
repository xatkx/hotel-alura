package com.hotely.alura.hotel.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity(name="ReservaEntity")
@Table(name="reservas")
public class ReservaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String fechaEntrada;
	private String fechaSalida;
	private String valor;
	private String formatPago;
	
	public ReservaEntity() {
		
	}



	public ReservaEntity(String fechaEntrada, String fechaSalida, String valor, String formatPago) {
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.valor = valor;
		this.formatPago = formatPago;
	}



	public ReservaEntity(Long id, String fechaEntrada, String fechaSalida, String valor, String formatPago) {
		this.id = id;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.valor = valor;
		this.formatPago = formatPago;
	}

	


	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getFechaEntrada() {
		return fechaEntrada;
	}



	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}



	public String getFechaSalida() {
		return fechaSalida;
	}



	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}



	public String getValor() {
		return valor;
	}



	public void setValor(String valor) {
		this.valor = valor;
	}



	public String getFormatPago() {
		return formatPago;
	}



	public void setFormatPago(String formatPago) {
		this.formatPago = formatPago;
	}



	@Override
	public String toString() {
		return "ReservaEntity [fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + ", valor=" + valor
				+ ", formatPago=" + formatPago + "]";
	}
	
	
}
