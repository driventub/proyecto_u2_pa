package com.uce.unidad2.tareas.service;

import java.math.BigDecimal;
import java.util.List;

import com.uce.unidad2.tareas.repository.modelo.Estudiante;

public interface IEstudianteJpaService {
	public Estudiante buscar(Integer id);

	public List<Estudiante> buscarTodos();

	public void actualizar(Estudiante e);

	public void eliminar(Integer id);

	public void insertar(Estudiante e);

	public List<Estudiante> buscarValorTyped(BigDecimal valor);

	public List<Estudiante> buscarValorNamed(BigDecimal valor);

	public List<Estudiante> buscarValorTypedNamed(BigDecimal valor);

	public Estudiante buscarEstudianteTyped(String nombre, String apellido, String curso);

	public Estudiante buscarEstudianteNamed(String nombre, String apellido, String curso);

	public Estudiante buscarEstudianteTypedNamed(String nombre, String apellido, String curso);

}