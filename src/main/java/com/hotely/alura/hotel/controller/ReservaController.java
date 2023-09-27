package com.hotely.alura.hotel.controller;

import java.util.List;

import com.hotely.alura.hotel.dao.ReservaDao;
import com.hotely.alura.hotel.model.ReservaEntity;

public class ReservaController {
	
	ReservaDao reservaDao = new ReservaDao();
	
	public int Guardar(String fechaEntrada, String fechaSalida, String valor, String eleccionPago) {
		ReservaEntity reserva = new ReservaEntity(fechaEntrada, fechaSalida,valor,eleccionPago);
		return reservaDao.agregarReserva(reserva);	
	}
	
	public List<ReservaEntity> getAll(){
		return reservaDao.obtenerTodosLosReservaEntitys();
	}

	public void delete(long id) {
		reservaDao.eliminarReservaEntity(id);
	}
	
	
}
