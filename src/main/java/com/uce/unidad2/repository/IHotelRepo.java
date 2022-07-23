package com.uce.unidad2.repository;

import java.util.List;

import com.uce.unidad2.repository.modelo.onetomany.Hotel;

public interface IHotelRepo {
	public Hotel buscar(Integer id);
	public List<Hotel> buscarTodos();
	public void actualizar(Hotel hote);
	public void eliminar(Integer id);
	public void insertar(Hotel hote);
}