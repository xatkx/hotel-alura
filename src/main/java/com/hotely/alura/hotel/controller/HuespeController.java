package com.hotely.alura.hotel.controller;

import java.util.List;

import com.hotely.alura.hotel.dao.HuespedesDao;
import com.hotely.alura.hotel.model.HuespedeEntity;

public class HuespeController {

	private HuespedesDao huespedesDao = new HuespedesDao();
	
	public void Guardar(HuespedeEntity huespe) {
		huespedesDao.agregarReserva(huespe);
	}
	
	public List<HuespedeEntity> getAll() {
		return huespedesDao.obtenerTodosLosHuespedeEntitys();
	}
	
	public void delete(long id) {
		huespedesDao.eliminarHuespedeEntity(id);
	}
}
