package com.uce.unidad2.service;

import java.util.List;

import com.uce.unidad2.repository.modelo.onetomany.Hotel;

public interface IHotelService {
	public Hotel buscar(Integer id);
	public List<Hotel> buscarTodos();
	public void actualizar(Hotel hote);
	public void eliminar(Integer id);
	public void insertar(Hotel hote);
}
