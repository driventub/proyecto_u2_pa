package com.uce.unidad2.tareas.service;

import java.util.List;

import com.uce.unidad2.tareas.repository.modelo.Estudiante;

public interface IEstudianteJpaService {
	public Estudiante buscar(Integer id);
	public List<Estudiante> buscarTodos();
	public void actualizar(Estudiante e);
	public void eliminar(Integer id);
	public void insertar(Estudiante e);
}