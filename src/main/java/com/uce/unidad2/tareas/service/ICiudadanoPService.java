package com.uce.unidad2.tareas.service;

import java.util.List;

import com.uce.unidad2.tareas.repository.modelo.CiudadanoP;

public interface ICiudadanoPService {
	public CiudadanoP buscar(Integer id);
	public List<CiudadanoP> buscarTodos();
	public void actualizar(CiudadanoP ciu);
	public void eliminar(Integer id);
	public void insertar(CiudadanoP ciu);
}