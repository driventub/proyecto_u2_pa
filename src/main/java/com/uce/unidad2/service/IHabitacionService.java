package com.uce.unidad2.service;

import java.util.List;

import com.uce.unidad2.repository.modelo.onetomany.Habitacion;

public interface IHabitacionService {
	public Habitacion buscar(Integer id);
	public List<Habitacion> buscarTodos();
	public void actualizar(Habitacion habi);
	public void eliminar(Integer id);
	public void insertar(Habitacion habi);
}

